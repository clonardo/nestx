import { Controller, Get, UseGuards, Param, Query } from '@nestjs/common';
import { AuthGuard } from '@nestjs/passport';
import { ResultList, NullableParseIntPipe } from './../../common';
import { LogsService } from './logs.service';
import { Log } from './../interfaces';
import { KeyValueDto } from './../dto';
import { Tags } from 'nest-swagger';

@Tags('core')
@Controller('log')
@UseGuards(AuthGuard('jwt'))
export class LogsController {
  constructor(private readonly logService: LogsService) { }

  @Get('query')
  async query(
    @Query('keyword') keyword?: string,
    @Query('page', new NullableParseIntPipe()) page: number = 1,
    @Query('size', new NullableParseIntPipe()) size: number = 10,
  ): Promise<ResultList<Log>> {
    return this.logService.query(page, size, { keyword });
  }

  @Get(':id')
  async findOne(@Param('id') id: string): Promise<Log> {
    return this.logService.findById(id);
  }

}

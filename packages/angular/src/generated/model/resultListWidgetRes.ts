/**
 * rest api interface
 * 项目标准接口
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { Query } from './query';
import { WidgetRes } from './widgetRes';


/**
 * 
 */
export interface ResultListWidgetRes { 
    /**
     * 
     */
    list: Array<WidgetRes>;
    /**
     * 
     */
    count?: number;
    query?: Query;
}
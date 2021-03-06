/**
 * rest api interface
 * 项目标准接口
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * 
 */
export interface EditArticleDto { 
    /**
     * 
     */
    id: string;
    /**
     * 
     */
    name?: string;
    /**
     * 
     */
    title: string;
    /**
     * 
     */
    keyword?: string;
    /**
     * 
     */
    picture?: string;
    /**
     * 
     */
    category: string;
    /**
     * 
     */
    description?: string;
    /**
     * 
     */
    author?: string;
    /**
     * 
     */
    sort?: number;
    /**
     * 
     */
    disable?: boolean;
    /**
     * 
     */
    meta?: string;
    /**
     * 
     */
    content?: string;
    /**
     * 
     */
    template?: string;
}


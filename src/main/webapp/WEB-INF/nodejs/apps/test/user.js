/**
 * Created by ljg on 2017/2/22.
 */

export default class Student{
    constructor(a){
        console.info("this start")
        console.info(a)
        console.info(this)
        console.info("this end");
    }
    getName(){
        return this.name;
    }
    setName(name){
        this.name=name;
    }
}
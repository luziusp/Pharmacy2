// Generated by rocketdb: Do not edit this code!

import {Doctor as concrete_Doctor} from '../Doctor';
import * as Long from 'long';

export abstract class Doctor {

    public static readonly __typeId: string = "2aa9a930-acaa-11e9-998f-5781b13de8b2";
    public static readonly __typeName: string = "pharmacy.Doctor";

    private _____domainId: string = null;
    private _____ownerId: string = null;
    private _____creatorId: string = null;
    private _____state: string = null;
    private _____operation: string = null;
    private _____tts: Long = null;
    private _____sequence: number = null;
    private _____ttsTo: Long = null;
    private ___id: string = null;
    private ___name: string = null;
    private ___firstName: string = null;
    private ___ean: string = null;
    private ___login: string = null;
    private ___password: string = null;
    private ___patientIds: string[] = [];

    public get __typeId(): string {
        return Doctor.__typeId;
    }

    public get __typeName(): string {
        return Doctor.__typeName;
    }

    public get __domainId(): string {
        return this._____domainId;
    }

    public set __domainId(value: string) {
        this._____domainId = value;
    }

    public get __ownerId(): string {
        return this._____ownerId;
    }

    public set __ownerId(value: string) {
        this._____ownerId = value;
    }

    public get __creatorId(): string {
        return this._____creatorId;
    }

    public set __creatorId(value: string) {
        this._____creatorId = value;
    }

    public get __state(): string {
        return this._____state;
    }

    public set __state(value: string) {
        this._____state = value;
    }

    public get __operation(): string {
        return this._____operation;
    }

    public set __operation(value: string) {
        this._____operation = value;
    }

    public get __tts(): Long {
        return this._____tts;
    }

    public set __tts(value: Long) {
        this._____tts = value;
    }

    public get __sequence(): number {
        return this._____sequence;
    }

    public set __sequence(value: number) {
        this._____sequence = value;
    }

    public get __ttsTo(): Long {
        return this._____ttsTo;
    }

    public set __ttsTo(value: Long) {
        this._____ttsTo = value;
    }

    public get id(): string {
        if (this.___id === null) {this.___id = this.createId();}
        return this.___id;
    }

    public set id(value: string) {
        this.___id = value;
    }

    public get name(): string {
        return this.___name;
    }

    public set name(value: string) {
        this.___name = value;
    }

    public get firstName(): string {
        return this.___firstName;
    }

    public set firstName(value: string) {
        this.___firstName = value;
    }

    public get ean(): string {
        return this.___ean;
    }

    public set ean(value: string) {
        this.___ean = value;
    }

    public get login(): string {
        return this.___login;
    }

    public set login(value: string) {
        this.___login = value;
    }

    public get password(): string {
        return this.___password;
    }

    public set password(value: string) {
        this.___password = value;
    }

    public get patientIds(): string[] {
        return this.___patientIds;
    }

    public set patientIds(value: string[]) {
        this.___patientIds = value !== null ? value : [];
    }

    protected createId(): string {
        var UUID = require('uuid-js');
        return UUID.create(1);
    }

    public static fromJson (json: {}):concrete_Doctor {
        if (!json) return null;

        let object = new concrete_Doctor();
        object.setJson(json);

        return object;
    }

    protected setJson (json: {}): void {
        if (json) {
            this.__domainId = json['__domainId'] != null ? json['__domainId'] : null;
            this.__ownerId = json['__ownerId'] != null ? json['__ownerId'] : null;
            this.__creatorId = json['__creatorId'] != null ? json['__creatorId'] : null;
            this.__state = json['__state'] != null ? json['__state'] : null;
            this.__operation = json['__operation'] != null ? json['__operation'] : null;
            this.__tts = json['__tts'] != null ? Long.fromString(json['__tts']) : null;
            this.__sequence = json['__sequence'] != null ? json['__sequence'] : null;
            this.__ttsTo = json['__ttsTo'] != null ? Long.fromString(json['__ttsTo']) : null;
            this.id = json['id'] != null ? json['id'] : null;
            this.name = json['name'] != null ? json['name'] : null;
            this.firstName = json['firstName'] != null ? json['firstName'] : null;
            this.ean = json['ean'] != null ? json['ean'] : null;
            this.login = json['login'] != null ? json['login'] : null;
            this.password = json['password'] != null ? json['password'] : null;
            this.patientIds = json['patientIds'] != null ? json['patientIds'] : [];
        }
    }

    protected writeJsonMembers(json: {}): void {
        {
            json['__tts'] = this.__tts !== null ? this.__tts.toString() : null;
        }
        {
            json['id'] = this.id;
        }
        {
            json['name'] = this.name;
        }
        {
            json['firstName'] = this.firstName;
        }
        {
            json['ean'] = this.ean;
        }
        {
            json['login'] = this.login;
        }
        {
            json['password'] = this.password;
        }
        {
            json['patientIds'] = this.patientIds;
        }
    }

    public toJson(injectType?:boolean): {} {
        let json = {};
        json['__typeId'] = this.__typeId;
        this.writeJsonMembers(json);
        return json;
    }

    public toString(): string {
        return JSON.stringify(this.toJson());
    }

}

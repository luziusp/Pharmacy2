// Generated by rocketdb: Do not edit this code!

using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

using System.Linq;
using System;

namespace Pharmacy.Types.Base
{
    #pragma warning disable 3021

    public abstract class BaseMedication
    {

        [CLSCompliantAttribute(false)]
        public const string __typeId = "9793b078-acae-11e9-85a0-39552ea1958a";
        [CLSCompliantAttribute(false)]
        public const string __typeName = "pharmacy.BaseMedication";

        private string __domainId;
        private string __ownerId;
        private string __creatorId;
        private string __state;
        private string __operation;
        private long? __tts;
        private int? __sequence;
        private long? __ttsTo;
        private string id;
        private string pharmacode;
        private string name;
        private double price;
        private string ean;
        private byte[] lastUpdate;
        private bool isActive;
        private string[] basedOnIds = new string[0];

        [CLSCompliantAttribute(false)]
        public virtual string __TypeId {
            get { return __typeId; }
        }

        [CLSCompliantAttribute(false)]
        public virtual string __TypeName {
            get { return __typeName; }
        }

        [CLSCompliantAttribute(false)]
        public virtual string __DomainId {
            get { return __domainId; }
            private set { __domainId = value; }
        }

        [CLSCompliantAttribute(false)]
        public virtual string __OwnerId {
            get { return __ownerId; }
            private set { __ownerId = value; }
        }

        [CLSCompliantAttribute(false)]
        public virtual string __CreatorId {
            get { return __creatorId; }
            private set { __creatorId = value; }
        }

        [CLSCompliantAttribute(false)]
        public virtual string __State {
            get { return __state; }
            private set { __state = value; }
        }

        [CLSCompliantAttribute(false)]
        public virtual string __Operation {
            get { return __operation; }
            private set { __operation = value; }
        }

        [CLSCompliantAttribute(false)]
        public virtual long? __Tts {
            get { return __tts; }
            private set { __tts = value; }
        }

        [CLSCompliantAttribute(false)]
        public virtual int? __Sequence {
            get { return __sequence; }
            private set { __sequence = value; }
        }

        [CLSCompliantAttribute(false)]
        public virtual long? __TtsTo {
            get { return __ttsTo; }
            private set { __ttsTo = value; }
        }

        public virtual string Id {
            get { return id; }
            set { id = value; }
        }

        public virtual string Pharmacode {
            get { return pharmacode; }
            set { pharmacode = value; }
        }

        public virtual string Name {
            get { return name; }
            set { name = value; }
        }

        public virtual double Price {
            get { return price; }
            set { price = value; }
        }

        public virtual string Ean {
            get { return ean; }
            set { ean = value; }
        }

        public virtual byte[] LastUpdate {
            get { return lastUpdate; }
            set { lastUpdate = value; }
        }

        public virtual bool IsActive {
            get { return isActive; }
            set { isActive = value; }
        }

        public virtual string[] BasedOnIds {
            get { return basedOnIds; }
            set { basedOnIds = value != null ? value : new string[0]; }
        }

        public static Pharmacy.Types.BaseMedication FromJson(JObject jo)
        {
            if (jo == null)
            {
                return null;
            }
            Pharmacy.Types.BaseMedication obj = new Pharmacy.Types.BaseMedication();
            obj.SetJson(jo);
            return obj;
        }

        protected virtual void SetJson(JObject jo)
        {
            this.__DomainId = (string)jo["__domainId"];
            this.__OwnerId = (string)jo["__ownerId"];
            this.__CreatorId = (string)jo["__creatorId"];
            this.__State = (string)jo["__state"];
            this.__Operation = (string)jo["__operation"];
            this.__Tts = (long?)jo["__tts"];
            this.__Sequence = (int?)jo["__sequence"];
            this.__TtsTo = (long?)jo["__ttsTo"];
            this.Id = (string)jo["id"];
            this.Pharmacode = (string)jo["pharmacode"];
            this.Name = (string)jo["name"];
            this.Price = (double)jo["price"];
            this.Ean = (string)jo["ean"];
            this.LastUpdate = (byte[])jo["lastUpdate"];
            this.IsActive = (bool)jo["isActive"];
            this.BasedOnIds = jo.GetValue("basedOnIds") != null ? jo.GetValue("basedOnIds").Values<string>().ToArray() : new string[] {};
        }

        public virtual JObject ToJson()
        {
            JTokenWriter writer = new JTokenWriter();
            ToJson(writer, false);
            return (JObject)writer.Token;
        }

        public virtual void ToJson(JsonWriter writer, bool injectType)
        {
            writer.WriteStartObject();
            writer.WritePropertyName("__typeId");
            writer.WriteValue(this.__TypeId);
            WriteMembers(writer);
            writer.WriteEndObject();
        }

        protected virtual void WriteMembers(JsonWriter writer)
        {
            {
                writer.WritePropertyName("__tts");
                writer.WriteValue(this.__Tts);
            }
            {
                writer.WritePropertyName("id");
                writer.WriteValue(this.Id);
            }
            {
                writer.WritePropertyName("pharmacode");
                if (this.Pharmacode != null) {
                        writer.WriteValue(this.Pharmacode);
                }
                else
                {
                    writer.WriteNull();
                }
            }
            {
                writer.WritePropertyName("name");
                writer.WriteValue(this.Name);
            }
            {
                writer.WritePropertyName("price");
                writer.WriteValue(this.Price);
            }
            {
                writer.WritePropertyName("ean");
                if (this.Ean != null) {
                        writer.WriteValue(this.Ean);
                }
                else
                {
                    writer.WriteNull();
                }
            }
            {
                writer.WritePropertyName("lastUpdate");
                writer.WriteValue(this.LastUpdate);
            }
            {
                writer.WritePropertyName("isActive");
                writer.WriteValue(this.IsActive);
            }
            {
                writer.WritePropertyName("basedOnIds");
                writer.WriteStartArray();
                if (this.BasedOnIds != null) {
                        for (int i = 0; i < this.BasedOnIds.Length; i++)
                        {
                            writer.WriteValue(this.BasedOnIds[i]);
                        }
                }
                writer.WriteEndArray();
            }
        }

        public virtual void Validate()
        {
        }

        public override string ToString()
        {
            return ToJson().ToString();
        }

    }
}

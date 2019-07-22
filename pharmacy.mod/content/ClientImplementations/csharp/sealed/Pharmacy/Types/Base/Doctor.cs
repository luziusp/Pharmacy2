// Generated by rocketdb: Do not edit this code!

using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

using System.Linq;
using System;

namespace Pharmacy.Types.Base
{
    #pragma warning disable 3021

    public abstract class Doctor
    {

        [CLSCompliantAttribute(false)]
        public const string __typeId = "2aa9a930-acaa-11e9-998f-5781b13de8b2";
        [CLSCompliantAttribute(false)]
        public const string __typeName = "pharmacy.Doctor";

        private string __domainId;
        private string __ownerId;
        private string __creatorId;
        private string __state;
        private string __operation;
        private long? __tts;
        private int? __sequence;
        private long? __ttsTo;
        private string id;
        private string name;
        private string firstName;
        private string ean;
        private string login;
        private string password;
        private string[] patientIds = new string[0];

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

        public virtual string Name {
            get { return name; }
            set { name = value; }
        }

        public virtual string FirstName {
            get { return firstName; }
            set { firstName = value; }
        }

        public virtual string Ean {
            get { return ean; }
            set { ean = value; }
        }

        public virtual string Login {
            get { return login; }
            set { login = value; }
        }

        public virtual string Password {
            get { return password; }
            set { password = value; }
        }

        public virtual string[] PatientIds {
            get { return patientIds; }
            set { patientIds = value != null ? value : new string[0]; }
        }

        public static Pharmacy.Types.Doctor FromJson(JObject jo)
        {
            if (jo == null)
            {
                return null;
            }
            Pharmacy.Types.Doctor obj = new Pharmacy.Types.Doctor();
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
            this.Name = (string)jo["name"];
            this.FirstName = (string)jo["firstName"];
            this.Ean = (string)jo["ean"];
            this.Login = (string)jo["login"];
            this.Password = (string)jo["password"];
            this.PatientIds = jo.GetValue("patientIds") != null ? jo.GetValue("patientIds").Values<string>().ToArray() : new string[] {};
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
                writer.WritePropertyName("name");
                writer.WriteValue(this.Name);
            }
            {
                writer.WritePropertyName("firstName");
                writer.WriteValue(this.FirstName);
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
                writer.WritePropertyName("login");
                writer.WriteValue(this.Login);
            }
            {
                writer.WritePropertyName("password");
                writer.WriteValue(this.Password);
            }
            {
                writer.WritePropertyName("patientIds");
                writer.WriteStartArray();
                if (this.PatientIds != null) {
                        for (int i = 0; i < this.PatientIds.Length; i++)
                        {
                            writer.WriteValue(this.PatientIds[i]);
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

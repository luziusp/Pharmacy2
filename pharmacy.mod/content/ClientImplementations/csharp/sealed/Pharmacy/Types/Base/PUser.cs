// Generated by rocketdb: Do not edit this code!

using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

using System.Linq;
using System;

namespace Pharmacy.Types.Base
{
    #pragma warning disable 3021

    public abstract class PUser
    {

        [CLSCompliantAttribute(false)]
        public const string __typeId = "43dd91d2-5d2b-11e9-8e99-4bbbc6df7cad";
        [CLSCompliantAttribute(false)]
        public const string __typeName = "pharmacy.PUser";

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

        public static Pharmacy.Types.PUser FromJson(JObject jo)
        {
            if (jo == null)
            {
                return null;
            }
            Pharmacy.Types.PUser obj = new Pharmacy.Types.PUser();
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

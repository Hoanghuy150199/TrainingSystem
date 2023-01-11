using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;
using System;


namespace MongoDB_CRUD.Models
{
    public class QuestionAnswer
    {
        [BsonId]
        [BsonRepresentation(BsonType.ObjectId)]
        public string Id { get; set; }
        [BsonElement("CourseName")]
        public string CourseName { get; set; }
        [BsonElement("QA")]
        public List<QA> QA { get; set; }
        [BsonElement("SessionDescription")]
        public string SessionDescription { get; set; }



    }
}

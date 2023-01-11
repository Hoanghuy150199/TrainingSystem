using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;
using System;


namespace MongoDB_CRUD.Models
{
    public class FinalExam
    {
        [BsonId]
        [BsonRepresentation(BsonType.ObjectId)]
        public string Id { get; set; }
        [BsonElement("Type")]
        public string Type { get; set; }
        [BsonElement("Submission")]
        public string Submission { get; set; }
        [BsonElement("Mark1st")]
        public double Mark1st { get; set; }
        [BsonElement("Weight")]
        public double Weight { get; set; }



    }
}

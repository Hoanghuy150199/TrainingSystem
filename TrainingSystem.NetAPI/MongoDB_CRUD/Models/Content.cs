using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;
using System;


namespace MongoDB_CRUD.Models
{
    public class Content
    {
        [BsonId]
        [BsonRepresentation(BsonType.ObjectId)]
        public string Id { get; set; }
        [BsonElement("ContentName")]
        public string ContentName { get; set; }
        [BsonElement("Documentation")]
        public string Documentation { get; set; }
        [BsonElement("Duration")]
        public int Duration { get; set; }
        [BsonElement("Exercises")]
        public List<Exercise> Exercises { get; set; }



    }
}

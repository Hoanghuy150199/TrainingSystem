using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;
using System;


namespace MongoDB_CRUD.Models
{
    public class QA
    {
        [BsonId]
        [BsonRepresentation(BsonType.ObjectId)]
        public string Id { get; set; }
        [BsonElement("Comment")]
        public string Comment { get; set; }
        [BsonElement("Author")]
        public string Author { get; set; }
        [BsonElement("DateOfComment")]
        public string DateOfComment { get; set; }



    }
}

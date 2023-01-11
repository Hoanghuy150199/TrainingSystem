using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;
using System;


namespace MongoDB_CRUD.Models
{
    public class ClassesCompleted
    {

        [BsonElement("ClassName")]
        public string ClassName { get; set; }
        [BsonElement("TotalScore")]
        public double TotalScore { get; set; }




    }
}

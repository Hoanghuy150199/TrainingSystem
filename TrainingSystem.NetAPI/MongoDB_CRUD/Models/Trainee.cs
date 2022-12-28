using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;
using System;


namespace MongoDB_CRUD.Models
{
    public class Trainee
    {
        [BsonId]
        [BsonRepresentation(BsonType.ObjectId)]
        public string Id { get; set; }
        [BsonElement("Username")]
        public string Username { get; set; }
        [BsonElement("Password")]
        public string Password { get; set; }
        [BsonElement("TraineeName")]
        public string TraineeName { get; set; }
        [BsonElement("SkillSet")]
        public List<string> SkillSet { get; set; }
        [BsonElement("ListOfClassesCompleted")]
        public List<Object> ListOfClassesCompleted { get; set; }
        [BsonElement("Level")]
        public string Level { get; set; }
        [BsonElement("ListOfClassesLearning")]
        public List<string> ListOfClassesLearning { get; set; }
        [BsonElement("ListOfClassesLiked")]
        public List<string> ListOfClassesLiked { get; set; }



        [BsonElement("_class")]
        public string _class { get; set; }




    }
}

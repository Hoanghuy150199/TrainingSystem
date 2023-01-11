using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;
using System;


namespace MongoDB_CRUD.Models
{
    public class TraineeCourseManagement
    {
        [BsonId]
        [BsonRepresentation(BsonType.ObjectId)]
        public string Id { get; set; }
        [BsonElement("TraineeName")]
        public string TraineeName { get; set; }
        [BsonElement("CourseName")]
        public string CourseName { get; set; }
        [BsonElement("Contents")]
        public List<Content> Contents { get; set; }
        [BsonElement("FinalExam")]
        public FinalExam FinalExam { get; set; }
        [BsonElement("TotalScore")]
        public double TotalScore { get; set; }
        [BsonElement("Status")]
        public string Status { get; set; }
        [BsonElement("Level")]
        public int Level { get; set; }
        [BsonElement("EnrollmentDate")]
        public DateTime EnrollmentDate { get; set; }
        [BsonElement("CompletedDate")]
        public DateTime CompletedDate { get; set; }
        [BsonElement("Rate")]
        public int Rate { get; set; }
        [BsonElement("_class")]
        public string _class { get; set; }


    }
}

class Video {
   String name;            //Video name
   boolean status = true;  //Status - Rented or not
   int rating = 0;         //0-10
   
  //Constuctor
   Video(String name)
   {
	   this.name = name;
   }
   
  //Getter and setter methods
   void setName(String name)
   {
	   this.name = name;
   }
   String getName()
   {
	   return this.name;
   }
   void setStatus(boolean status)
   {
	   this.status = status;
   }
   boolean getStatus()
   {
	   return this.status;
   }
   void setRating(int rating)
   {
	   this.rating = rating;
   }
   int getRating()
   {
	   return this.rating;
   }
}

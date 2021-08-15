import java.util.Scanner;

class VideoStore {
  Video[] mVideo = new Video[5];
  int i=0,j=0;
  
  //Add videos to the video list
  void addVideo(Scanner mScanner)
  {
	  if(i<mVideo.length) {
	  System.out.println("Enter the video name");
	  String vName = mScanner.next();
	  //Video myVideoItem = new Video(vName);
	  mVideo[i] = new Video(vName);
	  //i++;
	  j++;
	  for(Video myVideoI : mVideo)
	  {
		  if(myVideoI==null)
			  break;
		  System.out.println("Video Name is : " + myVideoI.getName());	  
	  }
	 i++;
	 }
	  else
	  {
		  System.out.println("Don't have sufficient space to add videos");
	  }
	  
  }
  
  //Prints the list of videos
  void listInventory(Scanner mScanner)
  {
	  System.out.println("Index			VideoName			Status			Rating");
	  for(int k=0;k<mVideo.length;k++)
	  {
		  if(mVideo[k]==null)
		  {
			  break;
		  }
		  if(mVideo[k].getStatus())
		  {
			  System.out.println(k +"			"  + mVideo[k].getName() + "			" +  "Available" + "			" + mVideo[k].getRating()); 
		  }
		  else
		  {
			  System.out.println(k +"			"  + mVideo[k].getName() + "		    " +  "Not Avialable" + "			" + mVideo[k].getRating()); 
		  }
	  }
  }
  
  //Rents a video
  void takeVideo(Scanner mScanner)
  {
	  listInventory(mScanner);
	 
	  System.out.println("Enter the video index to take on rent"); 
	  int index = mScanner.nextInt();
	  if(index>=0 && index<j && mVideo[index].status==true)
	  {
		  mVideo[index].setStatus(false);
		  System.out.println("The video is successfully rented");
	  }
	  else
	  {
		  System.out.println("Invalid Index or the Video is already being rented");
	  }
  }
  
  //Returns back a rented video
  void returnBack(Scanner mScanner)
  {
	  listInventory(mScanner);
	  System.out.println("Enter the video index to return it back"); 
	  int index = mScanner.nextInt();
	  if(index>=0 && index<j && mVideo[index].status==false)
	  {
		  mVideo[index].setStatus(true);
		  System.out.println("The video is successfully returned back");
	  }
	  else
	  {
		  System.out.println("Invalid Index or the Video is not being rented ");
		  returnBack(mScanner);
	  }
  }
  
  //Provide ratings for the video
  void provideRatings(Scanner mScanner)
  {
    listInventory(mScanner);
	  System.out.println("Enter the video index to rate");
	  int index = mScanner.nextInt();
	  if(index>=0 && index<j)
	  {
		  System.out.println("Provide the ratings between 1 to 10");
		  int ratings = mScanner.nextInt();
		  if(ratings>=1 && ratings<=10)
		  {
		    mVideo[index].setRating(ratings);
		    System.out.println("The given video is rated");
		  }
		  else
		  {
			  System.out.println("Provide appropriate ratings");
			  provideRatings(mScanner);
		  }
	  }
	  
  }
}

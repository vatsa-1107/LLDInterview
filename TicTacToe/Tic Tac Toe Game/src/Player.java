public class Player {
    private String nameOfPlayer;
    private PlayingPiece playingPiece;
    public Player(String nameOfPlayer, PlayingPiece playingPiece){
        this.nameOfPlayer = nameOfPlayer;
        this.playingPiece = playingPiece;
    }
    public String getNameOfPlayer(){
        return nameOfPlayer;
    }
    public PlayingPiece getPlayingPiece(){
        return playingPiece;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }
    public void setPlayingPiece(PlayingPiece playingPiece){
        this.playingPiece = playingPiece;
    }
}

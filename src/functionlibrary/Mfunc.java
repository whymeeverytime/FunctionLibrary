package functionlibrary;

public class Mfunc {

    public static long factorial( int theNumber ) {
        if ( theNumber == 1 ) {
            return 1;
        }
        else {
            return theNumber * factorial( theNumber - 1 );
        }
    }
    /* This overloaded method is for entering something bigger than integer limit.
     * However, result will still overflow if I enter smt. bigger than int. limit.
     * Sooooo, work in progress :/
    */
    /* 
        public static long factorial( long theNumber ) {

            if ( theNumber == 1 ) {
                return 1;
            }
            else {
                return theNumber * factorial( theNumber - 1 );
            }
        }
     */
}

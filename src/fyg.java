import java.util.Collection;
import java.util.List;

public interface fyg extends fvv, fyj {
   fyg.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fyg> L() {
      return List.of(this);
   }

   public static enum a {
      a,
      b,
      c;

      public boolean a() {
         return this == c;
      }
   }
}

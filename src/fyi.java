import java.util.Collection;
import java.util.List;

public interface fyi extends fvx, fyl {
   fyi.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fyi> L() {
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

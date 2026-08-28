import java.util.Collection;
import java.util.List;

public interface fwe extends ftt, fwh {
   fwe.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fwe> L() {
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

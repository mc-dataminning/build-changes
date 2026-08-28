import java.util.Collection;
import java.util.List;

public interface fwv extends fuk, fwy {
   fwv.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fwv> L() {
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

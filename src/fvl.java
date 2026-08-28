import java.util.Collection;
import java.util.List;

public interface fvl extends fta, fvo {
   fvl.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fvl> L() {
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

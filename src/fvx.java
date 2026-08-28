import java.util.Collection;
import java.util.List;

public interface fvx extends ftm, fwa {
   fvx.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fvx> L() {
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

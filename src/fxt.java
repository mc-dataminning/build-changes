import java.util.Collection;
import java.util.List;

public interface fxt extends fvi, fxw {
   fxt.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fxt> L() {
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

import java.util.Collection;
import java.util.List;

public interface fui extends frx, ful {
   fui.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fui> L() {
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

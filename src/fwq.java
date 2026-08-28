import java.util.Collection;
import java.util.List;

public interface fwq extends fuf, fwt {
   fwq.a w();

   default boolean E() {
      return true;
   }

   default Collection<? extends fwq> L() {
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

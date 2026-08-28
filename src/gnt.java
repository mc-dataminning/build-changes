import com.google.common.base.Splitter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gnt {
   private static final Splitter a = Splitter.on(',');
   private static final Splitter b = Splitter.on('=').limit(2);

   public static <O, S extends dwz<O, S>> Predicate<dwz<O, S>> a(dwy<O, S> $$0, String $$1) {
      Map<dxz<?>, Comparable<?>> $$2 = new HashMap<>();

      for (String $$3 : a.split($$1)) {
         Iterator<String> $$4 = b.split($$3).iterator();
         if ($$4.hasNext()) {
            String $$5 = $$4.next();
            dxz<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
               String $$7 = $$4.next();
               Comparable<?> $$8 = a((dxz<Comparable<?>>)$$6, $$7);
               if ($$8 == null) {
                  throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
               }

               $$2.put($$6, $$8);
            } else if (!$$5.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
            }
         }
      }

      return $$1x -> {
         for (Entry<dxz<?>, Comparable<?>> $$2x : $$2.entrySet()) {
            if (!Objects.equals($$1x.c($$2x.getKey()), $$2x.getValue())) {
               return false;
            }
         }

         return true;
      };
   }

   @Nullable
   private static <T extends Comparable<T>> T a(dxz<T> $$0, String $$1) {
      return $$0.b($$1).orElse(null);
   }
}

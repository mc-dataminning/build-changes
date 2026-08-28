import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hlw {
   static final int a = -1;
   private static final int b = 0;

   public static Object2IntMap<eao> a(fqq $$0, hlm.b $$1) {
      Map<dmm, List<ebr<?>>> $$2 = new HashMap<>();
      Map<hlw.a, Set<eao>> $$3 = new HashMap<>();
      $$1.a().forEach(($$3x, $$4x) -> {
         List<ebr<?>> $$5x = $$2.computeIfAbsent($$3x.b(), $$1xx -> List.copyOf($$0.a($$1xx)));
         hlw.a $$6x = hlw.a.a($$3x, $$4x, $$5x);
         $$3.computeIfAbsent($$6x, $$0xx -> Sets.newIdentityHashSet()).add($$3x);
      });
      int $$4 = 1;
      Object2IntMap<eao> $$5 = new Object2IntOpenHashMap();
      $$5.defaultReturnValue(-1);

      for (Set<eao> $$6 : $$3.values()) {
         Iterator<eao> $$7 = $$6.iterator();

         while ($$7.hasNext()) {
            eao $$8 = $$7.next();
            if ($$8.o() != dsz.b) {
               $$7.remove();
               $$5.put($$8, 0);
            }
         }

         if ($$6.size() > 1) {
            int $$9 = $$4++;
            $$6.forEach($$2x -> $$5.put($$2x, $$9));
         }
      }

      return $$5;
   }

   static record a(Object a, List<Object> b) {
      public static hlw.a a(eao $$0, gry.a $$1, List<ebr<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         Object $$4 = $$1.a($$0);
         return new hlw.a($$4, $$3);
      }

      private static List<Object> a(eao $$0, List<ebr<?>> $$1) {
         Object[] $$2 = new Object[$$1.size()];

         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            $$2[$$3] = $$0.c($$1.get($$3));
         }

         return List.of($$2);
      }
   }
}

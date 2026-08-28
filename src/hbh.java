import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hbh {
   static final int a = -1;
   private static final int b = 0;

   public static Object2IntMap<dvo> a(fkz $$0, hax.c $$1) {
      Map<dij, List<dwq<?>>> $$2 = new HashMap<>();
      Map<hbh.a, Set<dvo>> $$3 = new HashMap<>();
      $$1.a().forEach(($$3x, $$4x) -> {
         List<dwq<?>> $$5x = $$2.computeIfAbsent($$4x.a().b(), $$1xx -> List.copyOf($$0.a($$1xx)));
         hbh.a $$6x = hbh.a.a($$4x.a(), $$4x.b(), $$5x);
         $$3.computeIfAbsent($$6x, $$0xx -> Sets.newIdentityHashSet()).add($$4x.a());
      });
      int $$4 = 1;
      Object2IntMap<dvo> $$5 = new Object2IntOpenHashMap();
      $$5.defaultReturnValue(-1);

      for (Set<dvo> $$6 : $$3.values()) {
         Iterator<dvo> $$7 = $$6.iterator();

         while ($$7.hasNext()) {
            dvo $$8 = $$7.next();
            if ($$8.o() != dop.c) {
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
      public static hbh.a a(dvo $$0, hbo $$1, List<dwq<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         Object $$5 = $$1 instanceof gkr $$4 ? $$4.a($$0) : $$1;
         return new hbh.a($$5, $$3);
      }

      private static List<Object> a(dvo $$0, List<dwq<?>> $$1) {
         Object[] $$2 = new Object[$$1.size()];

         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            $$2[$$3] = $$0.c($$1.get($$3));
         }

         return List.of($$2);
      }
   }
}

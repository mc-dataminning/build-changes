import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hnd {
   static final int a = -1;
   private static final int b = 0;

   public static Object2IntMap<ebq> a(frs $$0, hmt.b $$1) {
      Map<dno, List<ect<?>>> $$2 = new HashMap<>();
      Map<hnd.a, Set<ebq>> $$3 = new HashMap<>();
      $$1.a().forEach(($$3x, $$4x) -> {
         List<ect<?>> $$5x = $$2.computeIfAbsent($$3x.b(), $$1xx -> List.copyOf($$0.a($$1xx)));
         hnd.a $$6x = hnd.a.a($$3x, $$4x, $$5x);
         $$3.computeIfAbsent($$6x, $$0xx -> Sets.newIdentityHashSet()).add($$3x);
      });
      int $$4 = 1;
      Object2IntMap<ebq> $$5 = new Object2IntOpenHashMap();
      $$5.defaultReturnValue(-1);

      for (Set<ebq> $$6 : $$3.values()) {
         Iterator<ebq> $$7 = $$6.iterator();

         while ($$7.hasNext()) {
            ebq $$8 = $$7.next();
            if ($$8.o() != dub.b) {
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
      public static hnd.a a(ebq $$0, gta.c $$1, List<ect<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         Object $$4 = $$1.a($$0);
         return new hnd.a($$4, $$3);
      }

      private static List<Object> a(ebq $$0, List<ect<?>> $$1) {
         Object[] $$2 = new Object[$$1.size()];

         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            $$2[$$3] = $$0.c($$1.get($$3));
         }

         return List.of($$2);
      }
   }
}

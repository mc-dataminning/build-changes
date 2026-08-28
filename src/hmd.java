import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hmd {
   static final int a = -1;
   private static final int b = 0;

   public static Object2IntMap<eat> a(fqv $$0, hlt.b $$1) {
      Map<dmr, List<ebw<?>>> $$2 = new HashMap<>();
      Map<hmd.a, Set<eat>> $$3 = new HashMap<>();
      $$1.a().forEach(($$3x, $$4x) -> {
         List<ebw<?>> $$5x = $$2.computeIfAbsent($$3x.b(), $$1xx -> List.copyOf($$0.a($$1xx)));
         hmd.a $$6x = hmd.a.a($$3x, $$4x, $$5x);
         $$3.computeIfAbsent($$6x, $$0xx -> Sets.newIdentityHashSet()).add($$3x);
      });
      int $$4 = 1;
      Object2IntMap<eat> $$5 = new Object2IntOpenHashMap();
      $$5.defaultReturnValue(-1);

      for (Set<eat> $$6 : $$3.values()) {
         Iterator<eat> $$7 = $$6.iterator();

         while ($$7.hasNext()) {
            eat $$8 = $$7.next();
            if ($$8.o() != dte.b) {
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
      public static hmd.a a(eat $$0, gsd.a $$1, List<ebw<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         Object $$4 = $$1.a($$0);
         return new hmd.a($$4, $$3);
      }

      private static List<Object> a(eat $$0, List<ebw<?>> $$1) {
         Object[] $$2 = new Object[$$1.size()];

         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            $$2[$$3] = $$0.c($$1.get($$3));
         }

         return List.of($$2);
      }
   }
}

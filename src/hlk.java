import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hlk {
   static final int a = -1;
   private static final int b = 0;

   public static Object2IntMap<eah> a(fqb $$0, hkz.c $$1) {
      Map<dmf, List<ebk<?>>> $$2 = new HashMap<>();
      Map<hlk.a, Set<eah>> $$3 = new HashMap<>();
      $$1.c().forEach(($$3x, $$4x) -> {
         List<ebk<?>> $$5x = $$2.computeIfAbsent($$4x.a().b(), $$1xx -> List.copyOf($$0.a($$1xx)));
         hlk.a $$6x = hlk.a.a($$4x.a(), $$4x.b(), $$5x);
         $$3.computeIfAbsent($$6x, $$0xx -> Sets.newIdentityHashSet()).add($$4x.a());
      });
      int $$4 = 1;
      Object2IntMap<eah> $$5 = new Object2IntOpenHashMap();
      $$5.defaultReturnValue(-1);

      for (Set<eah> $$6 : $$3.values()) {
         Iterator<eah> $$7 = $$6.iterator();

         while ($$7.hasNext()) {
            eah $$8 = $$7.next();
            if ($$8.o() != dss.b) {
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
      public static hlk.a a(eah $$0, gru $$1, List<ebk<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         Object $$4 = $$1.a($$0);
         return new hlk.a($$4, $$3);
      }

      private static List<Object> a(eah $$0, List<ebk<?>> $$1) {
         Object[] $$2 = new Object[$$1.size()];

         for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
            $$2[$$3] = $$0.c($$1.get($$3));
         }

         return List.of($$2);
      }
   }
}

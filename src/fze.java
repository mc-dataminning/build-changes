import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class fze implements fyx.a {
   private final exh a;
   private final Map<Long, Map<hz, Integer>> b = Maps.newTreeMap(Ordering.natural().reverse());

   fze(exh $$0) {
      this.a = $$0;
   }

   public void a(long $$0, hz $$1) {
      Map<hz, Integer> $$2 = this.b.computeIfAbsent($$0, $$0x -> Maps.newHashMap());
      int $$3 = $$2.getOrDefault($$1, 0);
      $$2.put($$1, $$3 + 1);
   }

   @Override
   public void a(esa $$0, fvm $$1, double $$2, double $$3, double $$4) {
      long $$5 = this.a.r.X();
      int $$6 = 200;
      double $$7 = 0.0025;
      Set<hz> $$8 = Sets.newHashSet();
      Map<hz, Integer> $$9 = Maps.newHashMap();
      ese $$10 = $$1.getBuffer(fvu.w());
      Iterator<Entry<Long, Map<hz, Integer>>> $$11 = this.b.entrySet().iterator();

      while ($$11.hasNext()) {
         Entry<Long, Map<hz, Integer>> $$12 = $$11.next();
         Long $$13 = $$12.getKey();
         Map<hz, Integer> $$14 = $$12.getValue();
         long $$15 = $$5 - $$13;
         if ($$15 > 200L) {
            $$11.remove();
         } else {
            for (Entry<hz, Integer> $$16 : $$14.entrySet()) {
               hz $$17 = $$16.getKey();
               Integer $$18 = $$16.getValue();
               if ($$8.add($$17)) {
                  enn $$19 = new enn(hz.c).g(0.002).h(0.0025 * (double)$$15).d((double)$$17.u(), (double)$$17.v(), (double)$$17.w()).d(-$$2, -$$3, -$$4);
                  fvk.a($$0, $$10, $$19.a, $$19.b, $$19.c, $$19.d, $$19.e, $$19.f, 1.0F, 1.0F, 1.0F, 1.0F);
                  $$9.put($$17, $$18);
               }
            }
         }
      }

      for (Entry<hz, Integer> $$20 : $$9.entrySet()) {
         hz $$21 = $$20.getKey();
         Integer $$22 = $$20.getValue();
         fyx.a($$0, $$1, String.valueOf($$22), $$21.u(), $$21.v(), $$21.w(), -1);
      }
   }
}

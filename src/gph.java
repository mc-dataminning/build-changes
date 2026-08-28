import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;

public class gph implements gpe.a {
   private static final int a = 160;
   private final flz b;
   private final Int2ObjectMap<gph.a> c = new Int2ObjectOpenHashMap();

   @Override
   public void a() {
      this.c.clear();
   }

   public void a(int $$0, jh $$1, List<abl.a> $$2) {
      this.c.put($$0, new gph.a($$1, $$2));
   }

   public void a(int $$0) {
      this.c.remove($$0);
   }

   public gph(flz $$0) {
      this.b = $$0;
   }

   @Override
   public void a(fgl $$0, gle $$1, double $$2, double $$3, double $$4) {
      fli $$5 = this.b.j.k();
      jh $$6 = jh.a($$5.b().d, 0.0, $$5.b().f);
      ObjectIterator var11 = this.c.values().iterator();

      while (var11.hasNext()) {
         gph.a $$7 = (gph.a)var11.next();
         jh $$8 = $$7.a;
         if ($$6.a($$8, 160.0)) {
            for (int $$9 = 0; $$9 < $$7.b.size(); $$9++) {
               abl.a $$10 = $$7.b.get($$9);
               double $$11 = (double)$$8.u() + 0.5;
               double $$12 = (double)$$8.v() + 2.0 + (double)$$9 * 0.25;
               double $$13 = (double)$$8.w() + 0.5;
               int $$14 = $$10.b() ? -16711936 : -3355444;
               gpe.a($$0, $$1, $$10.c(), $$11, $$12, $$13, $$14);
            }
         }
      }
   }

   static record a(jh a, List<abl.a> b) {
   }
}

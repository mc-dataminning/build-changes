import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;

public class glo implements gll.a {
   private static final int a = 160;
   private final fip b;
   private final Int2ObjectMap<glo.a> c = new Int2ObjectOpenHashMap();

   @Override
   public void a() {
      this.c.clear();
   }

   public void a(int $$0, jf $$1, List<aau.a> $$2) {
      this.c.put($$0, new glo.a($$1, $$2));
   }

   public void a(int $$0) {
      this.c.remove($$0);
   }

   public glo(fip $$0) {
      this.b = $$0;
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      fhy $$5 = this.b.j.k();
      jf $$6 = jf.a($$5.b().d, 0.0, $$5.b().f);
      ObjectIterator var11 = this.c.values().iterator();

      while (var11.hasNext()) {
         glo.a $$7 = (glo.a)var11.next();
         jf $$8 = $$7.a;
         if ($$6.a($$8, 160.0)) {
            for (int $$9 = 0; $$9 < $$7.b.size(); $$9++) {
               aau.a $$10 = $$7.b.get($$9);
               double $$11 = (double)$$8.u() + 0.5;
               double $$12 = (double)$$8.v() + 2.0 + (double)$$9 * 0.25;
               double $$13 = (double)$$8.w() + 0.5;
               int $$14 = $$10.b() ? -16711936 : -3355444;
               gll.a($$0, $$1, $$10.c(), $$11, $$12, $$13, $$14);
            }
         }
      }
   }

   static record a(jf a, List<aau.a> b) {
   }
}

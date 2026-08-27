import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;

public class fzh implements fze.a {
   private static final int a = 160;
   private final exo b;
   private final Int2ObjectMap<fzh.a> c = new Int2ObjectOpenHashMap();

   @Override
   public void a() {
      this.c.clear();
   }

   public void a(int $$0, hz $$1, List<ze.a> $$2) {
      this.c.put($$0, new fzh.a($$1, $$2));
   }

   public void a(int $$0) {
      this.c.remove($$0);
   }

   public fzh(exo $$0) {
      this.b = $$0;
   }

   @Override
   public void a(esh $$0, fvt $$1, double $$2, double $$3, double $$4) {
      ewz $$5 = this.b.j.m();
      hz $$6 = hz.a($$5.b().c, 0.0, $$5.b().e);
      ObjectIterator var11 = this.c.values().iterator();

      while (var11.hasNext()) {
         fzh.a $$7 = (fzh.a)var11.next();
         hz $$8 = $$7.a;
         if ($$6.a($$8, 160.0)) {
            for (int $$9 = 0; $$9 < $$7.b.size(); $$9++) {
               ze.a $$10 = $$7.b.get($$9);
               double $$11 = (double)$$8.u() + 0.5;
               double $$12 = (double)$$8.v() + 2.0 + (double)$$9 * 0.25;
               double $$13 = (double)$$8.w() + 0.5;
               int $$14 = $$10.b() ? -16711936 : -3355444;
               fze.a($$0, $$1, $$10.c(), $$11, $$12, $$13, $$14);
            }
         }
      }
   }

   static record a(hz a, List<ze.a> b) {
   }
}

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gef implements gdu.a {
   private final fby a;
   private final Map<aju<czg>, Map<String, efi>> b = Maps.newIdentityHashMap();
   private final Map<aju<czg>, Map<String, aae.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gef(fby $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ewr $$0, gai $$1, double $$2, double $$3, double $$4) {
      fbj $$5 = this.a.j.n();
      aju<czg> $$6 = this.a.r.ae();
      id $$7 = id.a($$5.b().c, 0.0, $$5.b().e);
      ewv $$8 = $$1.getBuffer(gaq.y());
      if (this.b.containsKey($$6)) {
         for (efi $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gag.a(
                  $$0,
                  $$8,
                  (double)$$9.h() - $$2,
                  (double)$$9.i() - $$3,
                  (double)$$9.j() - $$4,
                  (double)($$9.k() + 1) - $$2,
                  (double)($$9.l() + 1) - $$3,
                  (double)($$9.m() + 1) - $$4,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      Map<String, aae.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aae.a $$11 : $$10.values()) {
            efi $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gag.a(
                     $$0,
                     $$8,
                     (double)$$12.h() - $$2,
                     (double)$$12.i() - $$3,
                     (double)$$12.j() - $$4,
                     (double)($$12.k() + 1) - $$2,
                     (double)($$12.l() + 1) - $$3,
                     (double)($$12.m() + 1) - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  gag.a(
                     $$0,
                     $$8,
                     (double)$$12.h() - $$2,
                     (double)$$12.i() - $$3,
                     (double)$$12.j() - $$4,
                     (double)($$12.k() + 1) - $$2,
                     (double)($$12.l() + 1) - $$3,
                     (double)($$12.m() + 1) - $$4,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }

   public void a(efi $$0, List<aae.a> $$1, aju<czg> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aae.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aae.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

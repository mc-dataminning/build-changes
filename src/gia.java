import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gia implements ghp.a {
   private final fft a;
   private final Map<akj<dcf>, Map<String, eio>> b = Maps.newIdentityHashMap();
   private final Map<akj<dcf>, Map<String, aaq.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gia(fft $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fam $$0, ged $$1, double $$2, double $$3, double $$4) {
      ffe $$5 = this.a.j.l();
      akj<dcf> $$6 = this.a.r.af();
      ja $$7 = ja.a($$5.b().c, 0.0, $$5.b().e);
      faq $$8 = $$1.getBuffer(gel.y());
      if (this.b.containsKey($$6)) {
         for (eio $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               geb.a(
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

      Map<String, aaq.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aaq.a $$11 : $$10.values()) {
            eio $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  geb.a(
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
                  geb.a(
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

   public void a(eio $$0, List<aaq.a> $$1, akj<dcf> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aaq.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aaq.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

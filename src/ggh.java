import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ggh implements gfw.a {
   private final feb a;
   private final Map<akm<daz>, Map<String, ehd>> b = Maps.newIdentityHashMap();
   private final Map<akm<daz>, Map<String, aat.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public ggh(feb $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eyu $$0, gck $$1, double $$2, double $$3, double $$4) {
      fdm $$5 = this.a.j.m();
      akm<daz> $$6 = this.a.r.ae();
      io $$7 = io.a($$5.b().c, 0.0, $$5.b().e);
      eyy $$8 = $$1.getBuffer(gcs.y());
      if (this.b.containsKey($$6)) {
         for (ehd $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gci.a(
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

      Map<String, aat.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aat.a $$11 : $$10.values()) {
            ehd $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gci.a(
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
                  gci.a(
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

   public void a(ehd $$0, List<aat.a> $$1, akm<daz> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aat.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aat.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gir implements gig.a {
   private final fgi a;
   private final Map<akp<dcu>, Map<String, eje>> b = Maps.newIdentityHashMap();
   private final Map<akp<dcu>, Map<String, aaw.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gir(fgi $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, get $$1, double $$2, double $$3, double $$4) {
      ffs $$5 = this.a.j.l();
      akp<dcu> $$6 = this.a.r.af();
      jd $$7 = jd.a($$5.b().c, 0.0, $$5.b().e);
      fbg $$8 = $$1.getBuffer(gfb.w());
      if (this.b.containsKey($$6)) {
         for (eje $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               ger.a(
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

      Map<String, aaw.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aaw.a $$11 : $$10.values()) {
            eje $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  ger.a(
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
                  ger.a(
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

   public void a(eje $$0, List<aaw.a> $$1, akp<dcu> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aaw.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aaw.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

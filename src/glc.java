import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class glc implements gkq.a {
   private final fib a;
   private final Map<ala<dds>, Map<String, ekg>> b = Maps.newIdentityHashMap();
   private final Map<ala<dds>, Map<String, abc.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public glc(fib $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fcu $$0, ggv $$1, double $$2, double $$3, double $$4) {
      fhk $$5 = this.a.j.l();
      ala<dds> $$6 = this.a.s.ag();
      je $$7 = je.a($$5.b().d, 0.0, $$5.b().f);
      fcy $$8 = $$1.getBuffer(ghe.z());
      if (this.b.containsKey($$6)) {
         for (ekg $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               ghl.a(
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

      Map<String, abc.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abc.a $$11 : $$10.values()) {
            ekg $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  ghl.a(
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
                  ghl.a(
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

   public void a(ekg $$0, List<abc.a> $$1, ala<dds> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abc.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abc.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

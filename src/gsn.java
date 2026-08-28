import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gsn implements gsa.a {
   private final fnd a;
   private final Map<alc<dhp>, Map<String, eoy>> b = Maps.newIdentityHashMap();
   private final Map<alc<dhp>, Map<String, aau.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gsn(fnd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fho $$0, gny $$1, double $$2, double $$3, double $$4) {
      fml $$5 = this.a.j.k();
      alc<dhp> $$6 = this.a.s.aj();
      jj $$7 = jj.a($$5.b().d, 0.0, $$5.b().f);
      fhs $$8 = $$1.getBuffer(goi.y());
      if (this.b.containsKey($$6)) {
         for (eoy $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gos.a(
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

      Map<String, aau.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aau.a $$11 : $$10.values()) {
            eoy $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gos.a(
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
                  gos.a(
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

   public void a(eoy $$0, List<aau.a> $$1, alc<dhp> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aau.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aau.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

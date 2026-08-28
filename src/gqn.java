import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gqn implements gqa.a {
   private final flk a;
   private final Map<aku<dgj>, Map<String, enf>> b = Maps.newIdentityHashMap();
   private final Map<aku<dgj>, Map<String, aao.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gqn(flk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ffv $$0, glz $$1, double $$2, double $$3, double $$4) {
      fks $$5 = this.a.j.k();
      aku<dgj> $$6 = this.a.s.ai();
      ji $$7 = ji.a($$5.b().d, 0.0, $$5.b().f);
      ffz $$8 = $$1.getBuffer(gmj.y());
      if (this.b.containsKey($$6)) {
         for (enf $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gmt.a(
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

      Map<String, aao.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aao.a $$11 : $$10.values()) {
            enf $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gmt.a(
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
                  gmt.a(
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

   public void a(enf $$0, List<aao.a> $$1, aku<dgj> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aao.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aao.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

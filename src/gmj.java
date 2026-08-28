import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gmj implements glw.a {
   private final fja a;
   private final Map<alg<dev>, Map<String, elj>> b = Maps.newIdentityHashMap();
   private final Map<alg<dev>, Map<String, abg.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gmj(fja $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fdt $$0, ghw $$1, double $$2, double $$3, double $$4) {
      fij $$5 = this.a.j.k();
      alg<dev> $$6 = this.a.s.ag();
      jg $$7 = jg.a($$5.b().d, 0.0, $$5.b().f);
      fdx $$8 = $$1.getBuffer(gig.y());
      if (this.b.containsKey($$6)) {
         for (elj $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               giq.a(
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

      Map<String, abg.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abg.a $$11 : $$10.values()) {
            elj $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  giq.a(
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
                  giq.a(
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

   public void a(elj $$0, List<abg.a> $$1, alg<dev> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abg.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abg.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

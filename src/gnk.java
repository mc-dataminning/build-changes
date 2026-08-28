import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gnk implements gmx.a {
   private final fjx a;
   private final Map<alk<dff>, Map<String, elt>> b = Maps.newIdentityHashMap();
   private final Map<alk<dff>, Map<String, abk.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gnk(fjx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fek $$0, gix $$1, double $$2, double $$3, double $$4) {
      fjg $$5 = this.a.j.k();
      alk<dff> $$6 = this.a.s.ag();
      jh $$7 = jh.a($$5.b().d, 0.0, $$5.b().f);
      feo $$8 = $$1.getBuffer(gjh.y());
      if (this.b.containsKey($$6)) {
         for (elt $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gjr.a(
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

      Map<String, abk.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abk.a $$11 : $$10.values()) {
            elt $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gjr.a(
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
                  gjr.a(
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

   public void a(elt $$0, List<abk.a> $$1, alk<dff> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abk.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abk.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

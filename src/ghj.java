import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ghj implements ggy.a {
   private final ffd a;
   private final Map<ald<dbw>, Map<String, eia>> b = Maps.newIdentityHashMap();
   private final Map<ald<dbw>, Map<String, abk.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public ghj(ffd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezw $$0, gdm $$1, double $$2, double $$3, double $$4) {
      feo $$5 = this.a.j.l();
      ald<dbw> $$6 = this.a.r.af();
      iz $$7 = iz.a($$5.b().c, 0.0, $$5.b().e);
      faa $$8 = $$1.getBuffer(gdu.y());
      if (this.b.containsKey($$6)) {
         for (eia $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gdk.a(
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
            eia $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gdk.a(
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
                  gdk.a(
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

   public void a(eia $$0, List<abk.a> $$1, ald<dbw> $$2) {
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

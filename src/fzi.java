import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fzi implements fyx.a {
   private final exh a;
   private final Map<aix<cvn>, Map<String, eaw>> b = Maps.newIdentityHashMap();
   private final Map<aix<cvn>, Map<String, zm.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fzi(exh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(esa $$0, fvm $$1, double $$2, double $$3, double $$4) {
      ews $$5 = this.a.j.m();
      aix<cvn> $$6 = this.a.r.ae();
      hz $$7 = hz.a($$5.b().c, 0.0, $$5.b().e);
      ese $$8 = $$1.getBuffer(fvu.w());
      if (this.b.containsKey($$6)) {
         for (eaw $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               fvk.a(
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

      Map<String, zm.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (zm.a $$11 : $$10.values()) {
            eaw $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  fvk.a(
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
                  fvk.a(
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

   public void a(eaw $$0, List<zm.a> $$1, aix<cvn> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, zm.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (zm.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

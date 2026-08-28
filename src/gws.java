import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gws implements gwf.a {
   private final frf a;
   private final Map<alj<djz>, Map<String, erv>> b = Maps.newIdentityHashMap();
   private final Map<alj<djz>, Map<String, abb.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gws(frf $$0) {
      this.a = $$0;
   }

   @Override
   public void a(flq $$0, gsc $$1, double $$2, double $$3, double $$4) {
      fqn $$5 = this.a.j.k();
      alj<djz> $$6 = this.a.s.aj();
      iw $$7 = iw.a($$5.b().d, 0.0, $$5.b().f);
      flt $$8 = $$1.getBuffer(gsn.w());
      if (this.b.containsKey($$6)) {
         for (erv $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gsv.a(
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

      Map<String, abb.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abb.a $$11 : $$10.values()) {
            erv $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gsv.a(
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
                  gsv.a(
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

   public void a(erv $$0, List<abb.a> $$1, alj<djz> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abb.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abb.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}

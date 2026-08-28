import java.util.Map;

public class gpe extends gop<cgf, fxv<cgf>> {
   private final fxv<cgf> a;
   private static final Map<bso.a, akq> b = Map.of(
      bso.a.b,
      akq.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bso.a.c,
      akq.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bso.a.d,
      akq.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gpe(glz<cgf, fxv<cgf>> $$0, fya $$1) {
      super($$0);
      this.a = new fxv<>($$1.a(fyd.ce));
   }

   public void a(fbc $$0, get $$1, int $$2, cgf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gC()) {
         cuo $$10 = $$3.fN();
         if ($$10.g() instanceof csc $$11 && $$11.d() == csc.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fbg $$13 = $$1.getBuffer(gfb.e($$11.b()));
            this.a.a($$0, $$13, $$2, gpw.d);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(fbc $$0, get $$1, int $$2, cuo $$3, csc $$4) {
      if ($$3.a(awm.bx)) {
         int $$5 = cxi.a($$3, 0);
         if (axx.b.a($$5) == 0) {
            return;
         }

         akq $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         this.a.a($$0, $$1.getBuffer(gfb.e($$6)), $$2, gpw.d, axx.b.e($$5));
      }
   }

   private void a(fbc $$0, get $$1, int $$2, cuo $$3) {
      bso.a $$4 = bso.b.a($$3);
      if ($$4 != bso.a.a) {
         akq $$5 = b.get($$4);
         fbg $$6 = $$1.getBuffer(gfb.i($$5));
         this.a.a($$0, $$6, $$2, gpw.d);
      }
   }
}

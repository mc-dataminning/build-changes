import java.util.Map;

public class gpi extends got<cgh, fxz<cgh>> {
   private final fxz<cgh> a;
   private static final Map<bsp.a, akr> b = Map.of(
      bsp.a.b,
      akr.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bsp.a.c,
      akr.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bsp.a.d,
      akr.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gpi(gmd<cgh, fxz<cgh>> $$0, fye $$1) {
      super($$0);
      this.a = new fxz<>($$1.a(fyh.ce));
   }

   public void a(fbg $$0, gex $$1, int $$2, cgh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gB()) {
         cuq $$10 = $$3.fP();
         if ($$10.g() instanceof cse $$11 && $$11.d() == cse.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fbk $$13 = $$1.getBuffer(gff.e($$11.b()));
            this.a.a($$0, $$13, $$2, gqa.d);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(fbg $$0, gex $$1, int $$2, cuq $$3, cse $$4) {
      if ($$3.a(awn.bx)) {
         int $$5 = cxk.a($$3, 0);
         if (axy.b.a($$5) == 0) {
            return;
         }

         akr $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         this.a.a($$0, $$1.getBuffer(gff.e($$6)), $$2, gqa.d, axy.b.e($$5));
      }
   }

   private void a(fbg $$0, gex $$1, int $$2, cuq $$3) {
      bsp.a $$4 = bsp.b.a($$3);
      if ($$4 != bsp.a.a) {
         akr $$5 = b.get($$4);
         fbk $$6 = $$1.getBuffer(gff.i($$5));
         this.a.a($$0, $$6, $$2, gqa.d);
      }
   }
}

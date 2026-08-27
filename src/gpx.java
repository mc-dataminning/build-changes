import java.util.Map;

public class gpx extends gpi<cfh, fyj<cfh>> {
   private final fyj<cfh> a;
   private static final Map<brt.a, akt> b = Map.of(
      brt.a.b,
      new akt("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      brt.a.c,
      new akt("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      brt.a.d,
      new akt("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gpx(gmp<cfh, fyj<cfh>> $$0, fyo $$1) {
      super($$0);
      this.a = new fyj<>($$1.a(fyr.cj));
   }

   public void a(fbc $$0, gfg $$1, int $$2, cfh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gK()) {
         cuh $$10 = $$3.fZ();
         if ($$10.f() instanceof crs $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fbg var14 = $$1.getBuffer(gfo.e($$11.b()));
            this.a.a($$0, var14, $$2, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(fbc $$0, gfg $$1, int $$2, cuh $$3, crs $$4) {
      if ($$3.a(awm.bA)) {
         int $$5 = cxi.a($$3, 0);
         if (axw.b.a($$5) == 0) {
            return;
         }

         akt $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)axw.b.b($$5) / 255.0F;
         float $$8 = (float)axw.b.c($$5) / 255.0F;
         float $$9 = (float)axw.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gfo.e($$6)), $$2, gqp.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(fbc $$0, gfg $$1, int $$2, cuh $$3) {
      brt.a $$4 = brt.b.a($$3);
      if ($$4 != brt.a.a) {
         akt $$5 = b.get($$4);
         fbg $$6 = $$1.getBuffer(gfo.i($$5));
         this.a.a($$0, $$6, $$2, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

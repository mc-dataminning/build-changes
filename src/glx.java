import java.util.Map;

public class glx extends gli<ces, fus<ces>> {
   private final fus<ces> a;
   private static final Map<brf.a, akh> b = Map.of(
      brf.a.b,
      new akh("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      brf.a.c,
      new akh("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      brf.a.d,
      new akh("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public glx(gis<ces, fus<ces>> $$0, fux $$1) {
      super($$0);
      this.a = new fus<>($$1.a(fva.cd));
   }

   public void a(exx $$0, gbo $$1, int $$2, ces $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gB()) {
         csz $$10 = $$3.fQ();
         if ($$10.f() instanceof cqn $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            eyb var14 = $$1.getBuffer(gbw.e($$11.b()));
            this.a.a($$0, var14, $$2, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(exx $$0, gbo $$1, int $$2, csz $$3, cqn $$4) {
      if ($$3.a(avz.bz)) {
         int $$5 = cvp.a($$3, 0);
         if (axj.b.a($$5) == 0) {
            return;
         }

         akh $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)axj.b.b($$5) / 255.0F;
         float $$8 = (float)axj.b.c($$5) / 255.0F;
         float $$9 = (float)axj.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gbw.e($$6)), $$2, gmp.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(exx $$0, gbo $$1, int $$2, csz $$3) {
      brf.a $$4 = brf.b.a($$3);
      if ($$4 != brf.a.a) {
         akh $$5 = b.get($$4);
         eyb $$6 = $$1.getBuffer(gbw.i($$5));
         this.a.a($$0, $$6, $$2, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

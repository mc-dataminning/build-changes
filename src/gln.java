import java.util.Map;

public class gln extends gky<cdw, fui<cdw>> {
   private final fui<cdw> a;
   private static final Map<bqj.a, akf> b = Map.of(
      bqj.a.b,
      new akf("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bqj.a.c,
      new akf("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bqj.a.d,
      new akf("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gln(gii<cdw, fui<cdw>> $$0, fun $$1) {
      super($$0);
      this.a = new fui<>($$1.a(fuq.cd));
   }

   public void a(exn $$0, gbe $$1, int $$2, cdw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gB()) {
         csd $$10 = $$3.fQ();
         if ($$10.f() instanceof cpr $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            exr var14 = $$1.getBuffer(gbm.e($$11.b()));
            this.a.a($$0, var14, $$2, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(exn $$0, gbe $$1, int $$2, csd $$3, cpr $$4) {
      if ($$3.a(avw.ba)) {
         int $$5 = cut.a($$3, 0);
         if (axg.b.a($$5) == 0) {
            return;
         }

         akf $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)axg.b.b($$5) / 255.0F;
         float $$8 = (float)axg.b.c($$5) / 255.0F;
         float $$9 = (float)axg.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gbm.e($$6)), $$2, gmf.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(exn $$0, gbe $$1, int $$2, csd $$3) {
      bqj.a $$4 = bqj.b.a($$3);
      if ($$4 != bqj.a.a) {
         akf $$5 = b.get($$4);
         exr $$6 = $$1.getBuffer(gbm.i($$5));
         this.a.a($$0, $$6, $$2, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

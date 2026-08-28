import java.util.Map;

public class gop extends goa<cfv, fxh<cfv>> {
   private final fxh<cfv> a;
   private static final Map<bsf.a, akk> b = Map.of(
      bsf.a.b,
      new akk("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bsf.a.c,
      new akk("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bsf.a.d,
      new akk("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gop(glk<cfv, fxh<cfv>> $$0, fxm $$1) {
      super($$0);
      this.a = new fxh<>($$1.a(fxp.cd));
   }

   public void a(fao $$0, gef $$1, int $$2, cfv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gz()) {
         cud $$10 = $$3.fO();
         if ($$10.g() instanceof crs $$11 && $$11.d() == crs.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fas $$13 = $$1.getBuffer(gen.e($$11.b()));
            this.a.a($$0, $$13, $$2, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(fao $$0, gef $$1, int $$2, cud $$3, crs $$4) {
      if ($$3.a(awf.by)) {
         int $$5 = cwu.a($$3, 0);
         if (axq.b.a($$5) == 0) {
            return;
         }

         akk $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)axq.b.b($$5) / 255.0F;
         float $$8 = (float)axq.b.c($$5) / 255.0F;
         float $$9 = (float)axq.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gen.e($$6)), $$2, gph.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(fao $$0, gef $$1, int $$2, cud $$3) {
      bsf.a $$4 = bsf.b.a($$3);
      if ($$4 != bsf.a.a) {
         akk $$5 = b.get($$4);
         fas $$6 = $$1.getBuffer(gen.i($$5));
         this.a.a($$0, $$6, $$2, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

import java.util.Map;

public class gon extends gny<cfu, fxf<cfu>> {
   private final fxf<cfu> a;
   private static final Map<bse.a, akk> b = Map.of(
      bse.a.b,
      new akk("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bse.a.c,
      new akk("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bse.a.d,
      new akk("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gon(gli<cfu, fxf<cfu>> $$0, fxk $$1) {
      super($$0);
      this.a = new fxf<>($$1.a(fxn.cd));
   }

   public void a(fam $$0, ged $$1, int $$2, cfu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gA()) {
         cuc $$10 = $$3.fO();
         if ($$10.g() instanceof crr $$11 && $$11.d() == crr.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            faq $$13 = $$1.getBuffer(gel.e($$11.b()));
            this.a.a($$0, $$13, $$2, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(fam $$0, ged $$1, int $$2, cuc $$3, crr $$4) {
      if ($$3.a(awf.by)) {
         int $$5 = cwt.a($$3, 0);
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
         this.a.a($$0, $$1.getBuffer(gel.e($$6)), $$2, gpf.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(fam $$0, ged $$1, int $$2, cuc $$3) {
      bse.a $$4 = bse.b.a($$3);
      if ($$4 != bse.a.a) {
         akk $$5 = b.get($$4);
         faq $$6 = $$1.getBuffer(gel.i($$5));
         this.a.a($$0, $$6, $$2, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

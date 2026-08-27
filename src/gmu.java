import java.util.Map;

public class gmu extends gmf<cfj, fvn<cfj>> {
   private final fvn<cfj> a;
   private static final Map<bru.a, akn> b = Map.of(
      bru.a.b,
      new akn("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bru.a.c,
      new akn("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bru.a.d,
      new akn("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gmu(gjp<cfj, fvn<cfj>> $$0, fvs $$1) {
      super($$0);
      this.a = new fvn<>($$1.a(fvv.cd));
   }

   public void a(eyu $$0, gck $$1, int $$2, cfj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gB()) {
         ctq $$10 = $$3.fQ();
         if ($$10.g() instanceof cre $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            eyy var14 = $$1.getBuffer(gcs.e($$11.b()));
            this.a.a($$0, var14, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(eyu $$0, gck $$1, int $$2, ctq $$3, cre $$4) {
      if ($$3.a(awf.bz)) {
         int $$5 = cwi.a($$3, 0);
         if (axp.b.a($$5) == 0) {
            return;
         }

         akn $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)axp.b.b($$5) / 255.0F;
         float $$8 = (float)axp.b.c($$5) / 255.0F;
         float $$9 = (float)axp.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gcs.e($$6)), $$2, gnm.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(eyu $$0, gck $$1, int $$2, ctq $$3) {
      bru.a $$4 = bru.b.a($$3);
      if ($$4 != bru.a.a) {
         akn $$5 = b.get($$4);
         eyy $$6 = $$1.getBuffer(gcs.i($$5));
         this.a.a($$0, $$6, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

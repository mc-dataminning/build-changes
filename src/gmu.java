import java.util.Map;

public class gmu extends gmf<cfh, fvn<cfh>> {
   private final fvn<cfh> a;
   private static final Map<brs.a, akm> b = Map.of(
      brs.a.b,
      new akm("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      brs.a.c,
      new akm("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      brs.a.d,
      new akm("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gmu(gjp<cfh, fvn<cfh>> $$0, fvs $$1) {
      super($$0);
      this.a = new fvn<>($$1.a(fvv.cd));
   }

   public void a(eys $$0, gck $$1, int $$2, cfh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gB()) {
         cto $$10 = $$3.fQ();
         if ($$10.g() instanceof crc $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            eyw var14 = $$1.getBuffer(gcs.e($$11.b()));
            this.a.a($$0, var14, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(eys $$0, gck $$1, int $$2, cto $$3, crc $$4) {
      if ($$3.a(awe.bz)) {
         int $$5 = cwg.a($$3, 0);
         if (axo.b.a($$5) == 0) {
            return;
         }

         akm $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)axo.b.b($$5) / 255.0F;
         float $$8 = (float)axo.b.c($$5) / 255.0F;
         float $$9 = (float)axo.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gcs.e($$6)), $$2, gnm.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(eys $$0, gck $$1, int $$2, cto $$3) {
      brs.a $$4 = brs.b.a($$3);
      if ($$4 != brs.a.a) {
         akm $$5 = b.get($$4);
         eyw $$6 = $$1.getBuffer(gcs.i($$5));
         this.a.a($$0, $$6, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

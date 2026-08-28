import java.util.Map;

public class goh extends gns<cfr, fwz<cfr>> {
   private final fwz<cfr> a;
   private static final Map<bsb.a, akk> b = Map.of(
      bsb.a.b,
      new akk("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bsb.a.c,
      new akk("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bsb.a.d,
      new akk("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public goh(glc<cfr, fwz<cfr>> $$0, fxe $$1) {
      super($$0);
      this.a = new fwz<>($$1.a(fxh.cd));
   }

   public void a(fag $$0, gdx $$1, int $$2, cfr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gz()) {
         cua $$10 = $$3.fN();
         if ($$10.g() instanceof cro $$11 && $$11.d() == cro.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fak $$13 = $$1.getBuffer(gef.e($$11.b()));
            this.a.a($$0, $$13, $$2, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(fag $$0, gdx $$1, int $$2, cua $$3, cro $$4) {
      if ($$3.a(awd.by)) {
         int $$5 = cwr.a($$3, 0);
         if (axo.b.a($$5) == 0) {
            return;
         }

         akk $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)axo.b.b($$5) / 255.0F;
         float $$8 = (float)axo.b.c($$5) / 255.0F;
         float $$9 = (float)axo.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gef.e($$6)), $$2, goz.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(fag $$0, gdx $$1, int $$2, cua $$3) {
      bsb.a $$4 = bsb.b.a($$3);
      if ($$4 != bsb.a.a) {
         akk $$5 = b.get($$4);
         fak $$6 = $$1.getBuffer(gef.i($$5));
         this.a.a($$0, $$6, $$2, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

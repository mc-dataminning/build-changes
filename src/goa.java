import java.util.Map;

public class goa extends gnl<cgk, fwt<cgk>> {
   private final fwt<cgk> a;
   private static final Map<bsu.a, alf> b = Map.of(
      bsu.a.b,
      new alf("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bsu.a.c,
      new alf("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bsu.a.d,
      new alf("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public goa(gkv<cgk, fwt<cgk>> $$0, fwy $$1) {
      super($$0);
      this.a = new fwt<>($$1.a(fxb.cd));
   }

   public void a(faa $$0, gdq $$1, int $$2, cgk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gC()) {
         cur $$10 = $$3.fR();
         if ($$10.g() instanceof csf $$11 && $$11.d() == csf.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fae $$13 = $$1.getBuffer(gdy.e($$11.b()));
            this.a.a($$0, $$13, $$2, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(faa $$0, gdq $$1, int $$2, cur $$3, csf $$4) {
      if ($$3.a(awy.by)) {
         int $$5 = cxj.a($$3, 0);
         if (ayj.b.a($$5) == 0) {
            return;
         }

         alf $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)ayj.b.b($$5) / 255.0F;
         float $$8 = (float)ayj.b.c($$5) / 255.0F;
         float $$9 = (float)ayj.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gdy.e($$6)), $$2, gos.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(faa $$0, gdq $$1, int $$2, cur $$3) {
      bsu.a $$4 = bsu.b.a($$3);
      if ($$4 != bsu.a.a) {
         alf $$5 = b.get($$4);
         fae $$6 = $$1.getBuffer(gdy.i($$5));
         this.a.a($$0, $$6, $$2, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

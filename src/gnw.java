import java.util.Map;

public class gnw extends gnh<cgg, fwp<cgg>> {
   private final fwp<cgg> a;
   private static final Map<bsq.a, ale> b = Map.of(
      bsq.a.b,
      new ale("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bsq.a.c,
      new ale("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bsq.a.d,
      new ale("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gnw(gkr<cgg, fwp<cgg>> $$0, fwu $$1) {
      super($$0);
      this.a = new fwp<>($$1.a(fwx.cd));
   }

   public void a(ezw $$0, gdm $$1, int $$2, cgg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gC()) {
         cun $$10 = $$3.fR();
         if ($$10.g() instanceof csb $$11 && $$11.d() == csb.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            faa $$13 = $$1.getBuffer(gdu.e($$11.b()));
            this.a.a($$0, $$13, $$2, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(ezw $$0, gdm $$1, int $$2, cun $$3, csb $$4) {
      if ($$3.a(awx.by)) {
         int $$5 = cxf.a($$3, 0);
         if (ayh.b.a($$5) == 0) {
            return;
         }

         ale $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)ayh.b.b($$5) / 255.0F;
         float $$8 = (float)ayh.b.c($$5) / 255.0F;
         float $$9 = (float)ayh.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gdu.e($$6)), $$2, goo.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(ezw $$0, gdm $$1, int $$2, cun $$3) {
      bsq.a $$4 = bsq.b.a($$3);
      if ($$4 != bsq.a.a) {
         ale $$5 = b.get($$4);
         faa $$6 = $$1.getBuffer(gdu.i($$5));
         this.a.a($$0, $$6, $$2, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

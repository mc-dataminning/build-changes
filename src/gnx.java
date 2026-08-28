import java.util.Map;

public class gnx extends gni<cgh, fwq<cgh>> {
   private final fwq<cgh> a;
   private static final Map<bsr.a, ale> b = Map.of(
      bsr.a.b,
      new ale("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bsr.a.c,
      new ale("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bsr.a.d,
      new ale("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gnx(gks<cgh, fwq<cgh>> $$0, fwv $$1) {
      super($$0);
      this.a = new fwq<>($$1.a(fwy.cd));
   }

   public void a(ezx $$0, gdn $$1, int $$2, cgh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gC()) {
         cuo $$10 = $$3.fR();
         if ($$10.g() instanceof csc $$11 && $$11.d() == csc.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fab $$13 = $$1.getBuffer(gdv.e($$11.b()));
            this.a.a($$0, $$13, $$2, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(ezx $$0, gdn $$1, int $$2, cuo $$3, csc $$4) {
      if ($$3.a(awx.by)) {
         int $$5 = cxg.a($$3, 0);
         if (ayi.b.a($$5) == 0) {
            return;
         }

         ale $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)ayi.b.b($$5) / 255.0F;
         float $$8 = (float)ayi.b.c($$5) / 255.0F;
         float $$9 = (float)ayi.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gdv.e($$6)), $$2, gop.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(ezx $$0, gdn $$1, int $$2, cuo $$3) {
      bsr.a $$4 = bsr.b.a($$3);
      if ($$4 != bsr.a.a) {
         ale $$5 = b.get($$4);
         fab $$6 = $$1.getBuffer(gdv.i($$5));
         this.a.a($$0, $$6, $$2, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

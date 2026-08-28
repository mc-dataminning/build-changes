import java.util.Map;

public class gnz extends gnk<cgj, fws<cgj>> {
   private final fws<cgj> a;
   private static final Map<bst.a, alf> b = Map.of(
      bst.a.b,
      new alf("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bst.a.c,
      new alf("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bst.a.d,
      new alf("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gnz(gku<cgj, fws<cgj>> $$0, fwx $$1) {
      super($$0);
      this.a = new fws<>($$1.a(fxa.cd));
   }

   public void a(ezz $$0, gdp $$1, int $$2, cgj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gC()) {
         cuq $$10 = $$3.fR();
         if ($$10.g() instanceof cse $$11 && $$11.d() == cse.a.b) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            fad $$13 = $$1.getBuffer(gdx.e($$11.b()));
            this.a.a($$0, $$13, $$2, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
            return;
         }
      }
   }

   private void a(ezz $$0, gdp $$1, int $$2, cuq $$3, cse $$4) {
      if ($$3.a(awy.by)) {
         int $$5 = cxi.a($$3, 0);
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
         this.a.a($$0, $$1.getBuffer(gdx.e($$6)), $$2, gor.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(ezz $$0, gdp $$1, int $$2, cuq $$3) {
      bst.a $$4 = bst.b.a($$3);
      if ($$4 != bst.a.a) {
         alf $$5 = b.get($$4);
         fad $$6 = $$1.getBuffer(gdx.i($$5));
         this.a.a($$0, $$6, $$2, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

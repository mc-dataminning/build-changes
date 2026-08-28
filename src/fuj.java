public class fuj<T extends bsh> extends fwa<T> {
   public fuj(fxq $$0) {
      super($$0, false, 10.0F, 4.0F, 2.0F, 2.0F, 24);
   }

   public static fxw c() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      int $$2 = 12;
      $$1.a(
         "head",
         fxv.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F),
         fxs.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         fxv.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         fxs.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      fxv $$3 = fxv.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, fxs.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$3, fxs.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, fxs.a(-4.0F, 12.0F, -6.0F));
      $$1.a("left_front_leg", $$3, fxs.a(4.0F, 12.0F, -6.0F));
      return fxw.a($$0, 64, 32);
   }

   public fxq d() {
      return this.a;
   }
}

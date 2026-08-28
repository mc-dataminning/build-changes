public class fvb<T extends bsr> extends fws<T> {
   public fvb(fyi $$0) {
      super($$0, false, 10.0F, 4.0F, 2.0F, 2.0F, 24);
   }

   public static fyo c() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      int $$2 = 12;
      $$1.a(
         "head",
         fyn.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F),
         fyk.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         fyn.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         fyk.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      fyn $$3 = fyn.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, fyk.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$3, fyk.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, fyk.a(-4.0F, 12.0F, -6.0F));
      $$1.a("left_front_leg", $$3, fyk.a(4.0F, 12.0F, -6.0F));
      return fyo.a($$0, 64, 32);
   }

   public fyi d() {
      return this.a;
   }
}

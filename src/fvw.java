public class fvw<T extends cge> extends fxc<T> {
   public fvw(fys $$0) {
      super($$0, true, 19.0F, 1.0F, 2.5F, 2.0F, 24);
   }

   public static fyy c() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fzb $$2 = $$1.a(
         "head",
         fyx.c()
            .a(2, 61)
            .a("right ear", -6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(2, 61)
            .a()
            .a("left ear", 2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(23, 52)
            .a("goatee", -0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
         fyu.a(1.0F, 14.0F, 0.0F)
      );
      $$2.a("left_horn", fyx.c().a(12, 55).a(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), fyu.a(0.0F, 0.0F, 0.0F));
      $$2.a("right_horn", fyx.c().a(12, 55).a(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), fyu.a(0.0F, 0.0F, 0.0F));
      $$2.a("nose", fyx.c().a(34, 46).a(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F), fyu.a(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));
      $$1.a("body", fyx.c().a(1, 1).a(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F).a(0, 28).a(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F), fyu.a(0.0F, 24.0F, 0.0F));
      $$1.a("left_hind_leg", fyx.c().a(36, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), fyu.a(1.0F, 14.0F, 4.0F));
      $$1.a("right_hind_leg", fyx.c().a(49, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), fyu.a(-3.0F, 14.0F, 4.0F));
      $$1.a("left_front_leg", fyx.c().a(49, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), fyu.a(1.0F, 14.0F, -6.0F));
      $$1.a("right_front_leg", fyx.c().a(35, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), fyu.a(-3.0F, 14.0F, -6.0F));
      return fyy.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a.b("left_horn").k = $$0.gy();
      this.a.b("right_horn").k = $$0.gE();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.gJ();
      if ($$6 != 0.0F) {
         this.a.e = $$6;
      }
   }
}

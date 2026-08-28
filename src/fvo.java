public class fvo<T extends che> extends fws<T> {
   public fvo(fyi $$0) {
      super($$0, true, 19.0F, 1.0F, 2.5F, 2.0F, 24);
   }

   public static fyo c() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      fyr $$2 = $$1.a(
         "head",
         fyn.c()
            .a(2, 61)
            .a("right ear", -6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(2, 61)
            .a()
            .a("left ear", 2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(23, 52)
            .a("goatee", -0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
         fyk.a(1.0F, 14.0F, 0.0F)
      );
      $$2.a("left_horn", fyn.c().a(12, 55).a(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), fyk.a(0.0F, 0.0F, 0.0F));
      $$2.a("right_horn", fyn.c().a(12, 55).a(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), fyk.a(0.0F, 0.0F, 0.0F));
      $$2.a("nose", fyn.c().a(34, 46).a(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F), fyk.a(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));
      $$1.a("body", fyn.c().a(1, 1).a(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F).a(0, 28).a(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F), fyk.a(0.0F, 24.0F, 0.0F));
      $$1.a("left_hind_leg", fyn.c().a(36, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), fyk.a(1.0F, 14.0F, 4.0F));
      $$1.a("right_hind_leg", fyn.c().a(49, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), fyk.a(-3.0F, 14.0F, 4.0F));
      $$1.a("left_front_leg", fyn.c().a(49, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), fyk.a(1.0F, 14.0F, -6.0F));
      $$1.a("right_front_leg", fyn.c().a(35, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), fyk.a(-3.0F, 14.0F, -6.0F));
      return fyo.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a.b("left_horn").k = $$0.gl();
      this.a.b("right_horn").k = $$0.gm();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.gw();
      if ($$6 != 0.0F) {
         this.a.e = $$6;
      }
   }
}

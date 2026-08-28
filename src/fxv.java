import java.util.Set;

public class fxv extends fyy<guc> {
   public static final gaz a = new fwq(true, 19.0F, 1.0F, 2.5F, 2.0F, 24.0F, Set.of("head"));

   public fxv(gaq $$0) {
      super($$0);
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gba $$2 = $$1.a(
         "head",
         gav.c()
            .a(2, 61)
            .a("right ear", -6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(2, 61)
            .a()
            .a("left ear", 2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .a(23, 52)
            .a("goatee", -0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
         gas.a(1.0F, 14.0F, 0.0F)
      );
      $$2.a("left_horn", gav.c().a(12, 55).a(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gas.a(0.0F, 0.0F, 0.0F));
      $$2.a("right_horn", gav.c().a(12, 55).a(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), gas.a(0.0F, 0.0F, 0.0F));
      $$2.a("nose", gav.c().a(34, 46).a(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F), gas.a(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));
      $$1.a("body", gav.c().a(1, 1).a(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F).a(0, 28).a(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F), gas.a(0.0F, 24.0F, 0.0F));
      $$1.a("left_hind_leg", gav.c().a(36, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gas.a(1.0F, 14.0F, 4.0F));
      $$1.a("right_hind_leg", gav.c().a(49, 29).a(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), gas.a(-3.0F, 14.0F, 4.0F));
      $$1.a("left_front_leg", gav.c().a(49, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gas.a(1.0F, 14.0F, -6.0F));
      $$1.a("right_front_leg", gav.c().a(35, 2).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), gas.a(-3.0F, 14.0F, -6.0F));
      return gaw.a($$0, 64, 64);
   }

   public void a(guc $$0) {
      super.a($$0);
      this.b.b("left_horn").k = $$0.a;
      this.b.b("right_horn").k = $$0.b;
      if ($$0.c != 0.0F) {
         this.b.e = $$0.c;
      }
   }
}

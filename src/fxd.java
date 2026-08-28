import java.util.Set;

public class fxd extends fxo<gti> {
   public static final String a = "red_thing";
   public static final gaz b = new fwq(Set.of("head", "beak", "red_thing"));
   private final gaq c;
   private final gaq d;
   private final gaq e;
   private final gaq f;
   private final gaq g;
   private final gaq i;
   private final gaq j;

   public fxd(gaq $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.i = $$0.b("beak");
      this.j = $$0.b("red_thing");
      this.d = $$0.b("right_leg");
      this.e = $$0.b("left_leg");
      this.f = $$0.b("right_wing");
      this.g = $$0.b("left_wing");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      int $$2 = 16;
      $$1.a("head", gav.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gas.a(0.0F, 15.0F, -4.0F));
      $$1.a("beak", gav.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gas.a(0.0F, 15.0F, -4.0F));
      $$1.a("red_thing", gav.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gas.a(0.0F, 15.0F, -4.0F));
      $$1.a("body", gav.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gas.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gav $$3 = gav.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, gas.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, gas.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", gav.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gas.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", gav.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gas.a(4.0F, 13.0F, 0.0F));
      return gaw.a($$0, 64, 32);
   }

   public void a(gti $$0) {
      super.a($$0);
      float $$1 = (azf.a($$0.a) + 1.0F) * $$0.b;
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.i.e = this.c.e;
      this.i.f = this.c.f;
      this.j.e = this.c.e;
      this.j.f = this.c.f;
      float $$2 = $$0.Y;
      float $$3 = $$0.X;
      this.d.e = azf.b($$3 * 0.6662F) * 1.4F * $$2;
      this.e.e = azf.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.g = $$1;
      this.g.g = -$$1;
   }
}

public class fwr extends fxo<gta> {
   private final gaq a;
   private final gaq b;
   private final gaq c;
   private final gaq d;
   private final gaq e;
   private final gaq f;
   private final gaq g;

   public fwr(gaq $$0) {
      super($$0, ghv::e);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gba $$2 = $$1.a("body", gav.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gas.a(0.0F, 17.0F, 0.0F));
      gba $$3 = $$1.a("head", gav.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gas.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gav.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gas.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gav.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gas.a(1.1F, -3.0F, 0.0F));
      gba $$4 = $$2.a("right_wing", gav.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gas.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gav.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gas.a(-2.0F, 0.0F, 0.0F));
      gba $$5 = $$2.a("left_wing", gav.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gas.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gav.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gas.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gav.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gas.a(0.0F, 5.0F, 0.0F));
      return gaw.a($$0, 32, 32);
   }

   public void a(gta $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fji.b, $$0.p, 1.0F);
      this.a($$0.c, fji.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}

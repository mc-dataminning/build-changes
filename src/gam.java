public class gam extends gbk<gxc> {
   private final gem a;
   private final gem b;
   private final gem c;
   private final gem d;
   private final gem e;
   private final gem f;
   private final gem g;

   public gam(gem $$0) {
      super($$0, glt::e);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("body", ger.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), geo.a(0.0F, 17.0F, 0.0F));
      gew $$3 = $$1.a("head", ger.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), geo.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", ger.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), geo.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", ger.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), geo.a(1.1F, -3.0F, 0.0F));
      gew $$4 = $$2.a("right_wing", ger.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), geo.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", ger.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), geo.a(-2.0F, 0.0F, 0.0F));
      gew $$5 = $$2.a("left_wing", ger.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), geo.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", ger.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), geo.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", ger.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), geo.a(0.0F, 5.0F, 0.0F));
      return ges.a($$0, 32, 32);
   }

   public void a(gxc $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fmw.b, $$0.p, 1.0F);
      this.a($$0.c, fmw.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}

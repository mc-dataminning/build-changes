public class gin extends ghn<hfn> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final gkr c;
   private final gkr d;
   private final gkr e;
   private final gkr f;
   private final gkr g;
   private final gkr i;

   public gin(gkr $$0) {
      super($$0);
      gkr $$1 = $$0.b("body");
      this.g = $$1.b("tail_base");
      this.i = this.g.b("tail_tip");
      this.c = $$1.b("left_wing_base");
      this.d = this.c.b("left_wing_tip");
      this.e = $$1.b("right_wing_base");
      this.f = this.e.b("right_wing_tip");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("body", gkw.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), gkt.b(-0.1F, 0.0F, 0.0F));
      glb $$3 = $$2.a("tail_base", gkw.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), gkt.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", gkw.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), gkt.a(0.0F, 0.5F, 6.0F));
      glb $$4 = $$2.a("left_wing_base", gkw.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gkt.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", gkw.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gkt.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      glb $$5 = $$2.a("right_wing_base", gkw.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gkt.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", gkw.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gkt.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", gkw.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), gkt.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return gkx.a($$0, 64, 64);
   }

   public void a(hfn $$0) {
      super.a($$0);
      float $$1 = $$0.a * 7.448451F * (float) (Math.PI / 180.0);
      float $$2 = 16.0F;
      this.c.g = azz.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.d.g = azz.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.e.g = -this.c.g;
      this.f.g = -this.d.g;
      this.g.e = -(5.0F + azz.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.i.e = -(5.0F + azz.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}

public class gcg extends gbh<gyy> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final gej c;
   private final gej d;
   private final gej e;
   private final gej f;
   private final gej g;
   private final gej i;

   public gcg(gej $$0) {
      super($$0);
      gej $$1 = $$0.b("body");
      this.g = $$1.b("tail_base");
      this.i = this.g.b("tail_tip");
      this.c = $$1.b("left_wing_base");
      this.d = this.c.b("left_wing_tip");
      this.e = $$1.b("right_wing_base");
      this.f = this.e.b("right_wing_tip");
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      get $$2 = $$1.a("body", geo.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), gel.b(-0.1F, 0.0F, 0.0F));
      get $$3 = $$2.a("tail_base", geo.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), gel.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", geo.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), gel.a(0.0F, 0.5F, 6.0F));
      get $$4 = $$2.a("left_wing_base", geo.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gel.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", geo.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gel.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      get $$5 = $$2.a("right_wing_base", geo.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gel.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", geo.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gel.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", geo.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), gel.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return gep.a($$0, 64, 64);
   }

   public void a(gyy $$0) {
      super.a($$0);
      float $$1 = $$0.a * 7.448451F * (float) (Math.PI / 180.0);
      float $$2 = 16.0F;
      this.c.g = azu.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.d.g = azu.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.e.g = -this.c.g;
      this.f.g = -this.d.g;
      this.g.e = -(5.0F + azu.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.i.e = -(5.0F + azu.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}

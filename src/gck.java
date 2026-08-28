public class gck extends gbl<gzc> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final gen c;
   private final gen d;
   private final gen e;
   private final gen f;
   private final gen g;
   private final gen i;

   public gck(gen $$0) {
      super($$0);
      gen $$1 = $$0.b("body");
      this.g = $$1.b("tail_base");
      this.i = this.g.b("tail_tip");
      this.c = $$1.b("left_wing_base");
      this.d = this.c.b("left_wing_tip");
      this.e = $$1.b("right_wing_base");
      this.f = this.e.b("right_wing_tip");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      gex $$2 = $$1.a("body", ges.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), gep.b(-0.1F, 0.0F, 0.0F));
      gex $$3 = $$2.a("tail_base", ges.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), gep.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", ges.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), gep.a(0.0F, 0.5F, 6.0F));
      gex $$4 = $$2.a("left_wing_base", ges.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gep.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", ges.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gep.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      gex $$5 = $$2.a("right_wing_base", ges.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gep.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", ges.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gep.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", ges.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), gep.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return get.a($$0, 64, 64);
   }

   public void a(gzc $$0) {
      super.a($$0);
      float $$1 = $$0.a * 7.448451F * (float) (Math.PI / 180.0);
      float $$2 = 16.0F;
      this.c.g = bae.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.d.g = bae.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.e.g = -this.c.g;
      this.f.g = -this.d.g;
      this.g.e = -(5.0F + bae.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.i.e = -(5.0F + bae.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}

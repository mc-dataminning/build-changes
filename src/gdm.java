public class gdm extends gbm<gyt> {
   private static final String a = "upper_body";
   private final geo b;
   private final geo c;
   private final geo d;
   private final geo e;

   public gdm(geo $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.d = $$0.b("left_arm");
      this.e = $$0.b("right_arm");
      this.b = $$0.b("upper_body");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      float $$2 = 4.0F;
      ges $$3 = new ges(-0.5F);
      $$1.a("head", get.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), geq.a(0.0F, 4.0F, 0.0F));
      get $$4 = get.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, geq.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, geq.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", get.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), geq.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", get.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), geq.a(0.0F, 24.0F, 0.0F));
      return geu.a($$0, 64, 64);
   }

   public void a(gyt $$0) {
      super.a($$0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0) * 0.25F;
      float $$1 = bae.a(this.b.f);
      float $$2 = bae.b(this.b.f);
      this.d.f = this.b.f;
      this.e.f = this.b.f + (float) Math.PI;
      this.d.b = $$2 * 5.0F;
      this.d.d = -$$1 * 5.0F;
      this.e.b = -$$2 * 5.0F;
      this.e.d = $$1 * 5.0F;
   }

   public geo b() {
      return this.c;
   }
}

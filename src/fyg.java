public class fyg extends fyk<gvd> {
   public static final gbv a = gbv.scaling(0.5F);
   private final gbm b;
   private final gbm c;

   public fyg(gbm $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      gbq $$2 = new gbq(1.0F);
      $$1.a(
         "left_wing",
         gbr.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gbo.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gbr.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gbo.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gbs.a($$0, 64, 32);
   }

   public void a(gvd $$0) {
      super.a($$0);
      this.c.c = $$0.I ? 3.0F : 0.0F;
      this.c.e = $$0.N;
      this.c.g = $$0.P;
      this.c.f = $$0.O;
      this.b.f = -this.c.f;
      this.b.c = this.c.c;
      this.b.e = this.c.e;
      this.b.g = -this.c.g;
   }
}

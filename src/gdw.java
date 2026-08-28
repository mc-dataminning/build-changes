public class gdw extends gea<hbb> {
   public static final ghm a = ghm.scaling(0.5F);
   private final ghd b;
   private final ghd c;

   public gdw(ghd $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghh $$2 = new ghh(1.0F);
      $$1.a(
         "left_wing",
         ghi.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         ghf.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         ghi.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         ghf.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return ghj.a($$0, 64, 32);
   }

   public void a(hbb $$0) {
      super.a($$0);
      this.c.c = $$0.N ? 3.0F : 0.0F;
      this.c.e = $$0.S;
      this.c.g = $$0.U;
      this.c.f = $$0.T;
      this.b.f = -this.c.f;
      this.b.c = this.c.c;
      this.b.e = this.c.e;
      this.b.g = -this.c.g;
   }
}

public class gbd<S extends gxd> extends fyx<S> implements gav {
   private final gbm a = this.p.b("hat_rim");

   public gbd(gbm $$0) {
      super($$0);
   }

   public static gbs a() {
      gbu $$0 = fyx.a(gbq.a, 0.0F);
      gbw $$1 = $$0.a();
      gbw $$2 = $$1.a("head", new gbr().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gbo.a);
      gbw $$3 = $$2.a("hat", gbr.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gbq(0.5F)), gbo.a);
      $$3.a("hat_rim", gbr.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gbo.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gbr.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gbq(0.05F)), gbo.a);
      $$1.a("right_arm", gbr.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbo.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gbr.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbo.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gbr.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbo.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gbr.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbo.a(2.0F, 12.0F, 0.0F));
      return gbs.a($$0, 64, 64);
   }

   public static gbs a(gbq $$0) {
      gbu $$1 = fyx.a($$0, 0.0F);
      gbw $$2 = $$1.a();
      gbw $$3 = $$2.a("head", gbr.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gbo.a);
      $$2.a("body", gbr.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gbo.a);
      $$2.a("right_leg", gbr.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gbo.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gbr.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gbo.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gbr.c(), gbo.a);
      return gbs.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      fxf.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}

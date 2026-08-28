public class fye extends fxb<guj> {
   private final gbm e = this.c.b("left_chest");
   private final gbm f = this.c.b("right_chest");

   public fye(gbm $$0) {
      super($$0);
   }

   public static gbs a() {
      gbu $$0 = fxb.a(gbq.a);
      a($$0.a());
      return gbs.a($$0, 64, 64);
   }

   public static gbs b() {
      gbu $$0 = fxb.c(gbq.a);
      a($$0.a());
      return gbs.a(fxb.b.apply($$0), 64, 64);
   }

   private static void a(gbw $$0) {
      gbw $$1 = $$0.b("body");
      gbr $$2 = gbr.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gbo.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gbo.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gbw $$3 = $$0.b("head_parts").b("head");
      gbr $$4 = gbr.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gbo.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gbo.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(guj $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}

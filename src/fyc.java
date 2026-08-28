public class fyc extends fyk<gug> {
   private final gbm a;
   private final gbm b;
   private final gbm c;
   private final gbm d;
   private final gbm e;
   private static final int f = 6;

   public fyc(gbm $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.c = $$0.b("right_hind_leg");
      this.b = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.d = $$0.b("left_front_leg");
   }

   public static gbs a(gbq $$0) {
      gbu $$1 = new gbu();
      gbw $$2 = $$1.a();
      $$2.a("head", gbr.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gbo.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", gbr.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gbo.a(0.0F, 6.0F, 0.0F));
      gbr $$3 = gbr.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, gbo.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, gbo.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, gbo.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, gbo.a(2.0F, 18.0F, -4.0F));
      return gbs.a($$1, 64, 32);
   }

   public void a(gug $$0) {
      super.a($$0);
      this.a.f = $$0.U * (float) (Math.PI / 180.0);
      this.a.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.b.e = azk.b($$2 * 0.6662F) * 1.4F * $$1;
      this.c.e = azk.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.d.e = azk.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = azk.b($$2 * 0.6662F) * 1.4F * $$1;
   }
}

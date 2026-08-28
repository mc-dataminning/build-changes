public class gap extends fyk<gvl> {
   private final gbm a;

   public gap(gbm $$0) {
      super($$0, gir::f);
      this.a = $$0.b("tail");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gbr.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gbo.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gbr.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gbo.a(0.0F, 22.0F, 0.0F));
      return gbs.a($$0, 16, 16);
   }

   public void a(gvl $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azk.a(0.3F * $$0.p);
   }
}

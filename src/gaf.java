public class gaf<S extends gwi> extends fyx<S> {
   public gaf(gbm $$0) {
      super($$0);
   }

   public static gbs c() {
      gbu $$0 = fyx.a(gbq.a, 0.0F);
      gbw $$1 = $$0.a();
      a($$1);
      return gbs.a($$0, 64, 32);
   }

   protected static void a(gbw $$0) {
      $$0.a("right_arm", gbr.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbo.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", gbr.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbo.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", gbr.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbo.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", gbr.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbo.a(2.0F, 12.0F, 0.0F));
   }

   protected fyx.a a(S $$0, buu $$1) {
      return $$0.aW_().a(cwf.ow) && $$0.b && $$0.ap == $$1 ? fyx.a.d : fyx.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cwb $$1 = $$0.aW_();
      if ($$0.b && !$$1.a(cwf.ow)) {
         float $$2 = $$0.C;
         float $$3 = azk.a($$2 * (float) Math.PI);
         float $$4 = azk.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fxf.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(buu $$0, feb $$1) {
      this.e().a($$1);
      float $$2 = $$0 == buu.b ? 1.0F : -1.0F;
      gbm $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}

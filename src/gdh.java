public class gdh<S extends gzq> extends gbz<S> {
   public gdh(geo $$0) {
      super($$0);
   }

   public static geu c() {
      gew $$0 = gbz.a(ges.a, 0.0F);
      gey $$1 = $$0.a();
      a($$1);
      return geu.a($$0, 64, 32);
   }

   protected static void a(gey $$0) {
      $$0.a("right_arm", get.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), geq.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", get.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), geq.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", get.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), geq.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", get.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), geq.a(2.0F, 12.0F, 0.0F));
   }

   protected gbz.a a(S $$0, bwa $$1) {
      return $$0.aY_().a(cxt.oR) && $$0.b && $$0.ap == $$1 ? gbz.a.d : gbz.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cxp $$1 = $$0.aY_();
      if ($$0.b && !$$1.a(cxt.oR)) {
         float $$2 = $$0.C;
         float $$3 = bae.a($$2 * (float) Math.PI);
         float $$4 = bae.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         gag.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(bwa $$0, fgs $$1) {
      this.e().a($$1);
      float $$2 = $$0 == bwa.b ? 1.0F : -1.0F;
      geo $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}

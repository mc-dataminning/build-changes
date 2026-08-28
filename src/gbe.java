public class gbe<S extends gxj> extends fzw<S> {
   public gbe(gcl $$0) {
      super($$0);
   }

   public static gcr c() {
      gct $$0 = fzw.a(gcp.a, 0.0F);
      gcv $$1 = $$0.a();
      a($$1);
      return gcr.a($$0, 64, 32);
   }

   protected static void a(gcv $$0) {
      $$0.a("right_arm", gcq.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gcn.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", gcq.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gcn.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", gcq.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gcn.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", gcq.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gcn.a(2.0F, 12.0F, 0.0F));
   }

   protected fzw.a a(S $$0, bvb $$1) {
      return $$0.aW_().a(cwq.ow) && $$0.b && $$0.ap == $$1 ? fzw.a.d : fzw.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cwm $$1 = $$0.aW_();
      if ($$0.b && !$$1.a(cwq.ow)) {
         float $$2 = $$0.C;
         float $$3 = azm.a($$2 * (float) Math.PI);
         float $$4 = azm.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fye.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(bvb $$0, fer $$1) {
      this.e().a($$1);
      float $$2 = $$0 == bvb.b ? 1.0F : -1.0F;
      gcl $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}

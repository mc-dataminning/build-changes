public class gdg<S extends gzp> extends gby<S> {
   public gdg(gen $$0) {
      super($$0);
   }

   public static get c() {
      gev $$0 = gby.a(ger.a, 0.0F);
      gex $$1 = $$0.a();
      a($$1);
      return get.a($$0, 64, 32);
   }

   protected static void a(gex $$0) {
      $$0.a("right_arm", ges.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gep.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", ges.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gep.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", ges.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gep.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", ges.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gep.a(2.0F, 12.0F, 0.0F));
   }

   protected gby.a a(S $$0, bvz $$1) {
      return $$0.aY_().a(cxs.oR) && $$0.b && $$0.ap == $$1 ? gby.a.d : gby.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cxo $$1 = $$0.aY_();
      if ($$0.b && !$$1.a(cxs.oR)) {
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
         gaf.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(bvz $$0, fgr $$1) {
      this.e().a($$1);
      float $$2 = $$0 == bvz.b ? 1.0F : -1.0F;
      gen $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}

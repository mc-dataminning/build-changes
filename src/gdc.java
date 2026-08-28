public class gdc<S extends gzl> extends gbu<S> {
   public gdc(gej $$0) {
      super($$0);
   }

   public static gep c() {
      ger $$0 = gbu.a(gen.a, 0.0F);
      get $$1 = $$0.a();
      a($$1);
      return gep.a($$0, 64, 32);
   }

   protected static void a(get $$0) {
      $$0.a("right_arm", geo.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gel.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", geo.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gel.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", geo.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gel.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", geo.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gel.a(2.0F, 12.0F, 0.0F));
   }

   protected gbu.a a(S $$0, bvr $$1) {
      return $$0.aX_().a(cxk.pa) && $$0.b && $$0.ap == $$1 ? gbu.a.d : gbu.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cxg $$1 = $$0.aX_();
      if ($$0.b && !$$1.a(cxk.pa)) {
         float $$2 = $$0.C;
         float $$3 = azu.a($$2 * (float) Math.PI);
         float $$4 = azu.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fzz.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(bvr $$0, fgl $$1) {
      this.e().a($$1);
      float $$2 = $$0 == bvr.b ? 1.0F : -1.0F;
      gej $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}

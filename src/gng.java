public class gng extends gmi<ckr, gwf, fxj> {
   private static final ale a = ale.b("textures/entity/zombie/drowned.png");

   public gng(gno.a $$0) {
      super($$0, new fxj($$0.a(gap.ai)), new fxj($$0.a(gap.am)), new fxj($$0.a(gap.aj)), new fxj($$0.a(gap.ak)), new fxj($$0.a(gap.an)), new fxj($$0.a(gap.ao)));
      this.a(new grj(this, $$0.f()));
   }

   public gwf a() {
      return new gwf();
   }

   @Override
   public ale a(gwf $$0) {
      return a;
   }

   protected void a(gwf $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azf.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}

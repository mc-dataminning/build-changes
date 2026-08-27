public class gmm extends glz<cex, fvq<cex>> {
   private static final akt a = new akt("textures/entity/fish/pufferfish.png");
   private int b = 3;
   private final fvq<cex> g;
   private final fvq<cex> k;
   private final fvq<cex> l = this.a();

   public gmm(gkq.a $$0) {
      super($$0, new fwz<>($$0.a(fyr.bf)), 0.2F);
      this.k = new fxa<>($$0.a(fyr.bg));
      this.g = new fxb<>($$0.a(fyr.bh));
   }

   public akt a(cex $$0) {
      return a;
   }

   public void a(cex $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      int $$6 = $$0.gA();
      if ($$6 != this.b) {
         if ($$6 == 0) {
            this.h = this.g;
         } else if ($$6 == 1) {
            this.h = this.k;
         } else {
            this.h = this.l;
         }
      }

      this.b = $$6;
      this.e = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cex $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, aym.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}

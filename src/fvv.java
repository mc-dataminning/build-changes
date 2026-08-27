public class fvv extends fvj<bwn, ffx<bwn>> {
   private static final afw a = new afw("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final ffx<bwn> j;
   private final ffx<bwn> k;
   private final ffx<bwn> l = this.a();

   public fvv(fud.a $$0) {
      super($$0, new fhe<>($$0.a(fiv.aV)), 0.2F);
      this.k = new fhf<>($$0.a(fiv.aW));
      this.j = new fhg<>($$0.a(fiv.aX));
   }

   public afw a(bwn $$0) {
      return a;
   }

   public void a(bwn $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      int $$6 = $$0.gg();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bwn $$0, emh $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, asy.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}

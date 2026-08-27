public class fvj extends fun<bzr, fhb<bzr>> {
   private static final aew a = new aew("textures/entity/slime/slime.png");

   public fvj(fth.a $$0) {
      super($$0, new fhb<>($$0.a(fib.bm)), 0.25F);
      this.a(new fxt<>(this, $$0.f()));
   }

   public void a(bzr $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ge();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bzr $$0, elp $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.ge();
      float $$5 = arw.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public aew a(bzr $$0) {
      return a;
   }
}

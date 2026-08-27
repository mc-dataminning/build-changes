public class fzp extends fyf<cbi, fkt<cbi>> {
   private static final agt a = new agt("textures/entity/skeleton/skeleton.png");

   public fzp(fxo.a $$0) {
      this($$0, flx.bk, flx.bm, flx.bn);
   }

   public fzp(fxo.a $$0, flw $$1, flw $$2, flw $$3) {
      super($$0, new fkt<>($$0.a($$1)), 0.5F);
      this.a(new gbp<>(this, new fkt($$0.a($$2)), new fkt($$0.a($$3)), $$0.g()));
   }

   public agt a(cbi $$0) {
      return a;
   }

   protected boolean b(cbi $$0) {
      return $$0.ge();
   }
}

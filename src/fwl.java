public abstract class fwl<T extends ccs, M extends flq<T>> extends fyf<T, M> {
   private static final agt a = new agt("textures/entity/zombie/zombie.png");

   protected fwl(fxo.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gbp<>(this, $$2, $$3, $$0.g()));
   }

   public agt a(ccs $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gl();
   }
}

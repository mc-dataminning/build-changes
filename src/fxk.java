public abstract class fxk<T extends cdi, M extends fmp<T>> extends fze<T, M> {
   private static final ahg a = new ahg("textures/entity/zombie/zombie.png");

   protected fxk(fyn.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gco<>(this, $$2, $$3, $$0.g()));
   }

   public ahg a(cdi $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gl();
   }
}

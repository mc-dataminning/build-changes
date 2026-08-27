public abstract class gjk<T extends cjx, M extends fyk<T>> extends gli<T, M> {
   private static final akt a = new akt("textures/entity/zombie/zombie.png");

   protected gjk(gkq.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gov<>(this, $$2, $$3, $$0.g()));
   }

   public akt a(cjx $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gE();
   }
}

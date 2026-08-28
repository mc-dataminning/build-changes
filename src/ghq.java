public abstract class ghq<T extends cku, M extends fwq<T>> extends gjm<T, M> {
   private static final ale a = new ale("textures/entity/zombie/zombie.png");

   protected ghq(giv.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gmx<>(this, $$2, $$3, $$0.g()));
   }

   public ale a(cku $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gx();
   }
}

public abstract class gbw<T extends cgt, M extends fqx<T>> extends gds<T, M> {
   private static final ajh a = new ajh("textures/entity/zombie/zombie.png");

   protected gbw(gdb.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new ghc<>(this, $$2, $$3, $$0.g()));
   }

   public ajh a(cgt $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gu();
   }
}

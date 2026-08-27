public abstract class fxc<T extends cdc, M extends fmh<T>> extends fyw<T, M> {
   private static final ahd a = new ahd("textures/entity/zombie/zombie.png");

   protected fxc(fyf.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gcg<>(this, $$2, $$3, $$0.g()));
   }

   public ahd a(cdc $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gl();
   }
}

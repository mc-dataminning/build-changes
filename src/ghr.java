public abstract class ghr<T extends ckv, M extends fwr<T>> extends gjn<T, M> {
   private static final ale a = new ale("textures/entity/zombie/zombie.png");

   protected ghr(giw.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gmy<>(this, $$2, $$3, $$0.g()));
   }

   public ale a(ckv $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gx();
   }
}

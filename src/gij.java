public abstract class gij<T extends ckk, M extends fxi<T>> extends gkf<T, M> {
   private static final akk a = new akk("textures/entity/zombie/zombie.png");

   protected gij(gjo.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gnq<>(this, $$2, $$3, $$0.g()));
   }

   public akk a(ckk $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gu();
   }
}

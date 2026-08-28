public abstract class gih<T extends ckj, M extends fxg<T>> extends gkd<T, M> {
   private static final akk a = new akk("textures/entity/zombie/zombie.png");

   protected gih(gjm.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gno<>(this, $$2, $$3, $$0.g()));
   }

   public akk a(ckj $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gv();
   }
}

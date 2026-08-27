public abstract class fxw<T extends cdp, M extends fnb<T>> extends fzr<T, M> {
   private static final ahh a = new ahh("textures/entity/zombie/zombie.png");

   protected fxw(fza.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gdb<>(this, $$2, $$3, $$0.g()));
   }

   public ahh a(cdp $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gm();
   }
}

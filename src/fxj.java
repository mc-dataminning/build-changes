public abstract class fxj<T extends cdh, M extends fmo<T>> extends fzd<T, M> {
   private static final ahg a = new ahg("textures/entity/zombie/zombie.png");

   protected fxj(fym.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gcn<>(this, $$2, $$3, $$0.g()));
   }

   public ahg a(cdh $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gl();
   }
}

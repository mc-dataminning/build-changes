public abstract class fui<T extends cbt, M extends fjt<T>> extends fwb<T, M> {
   private static final agg a = new agg("textures/entity/zombie/zombie.png");

   protected fui(fvk.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fzi<>(this, $$2, $$3, $$0.g()));
   }

   public agg a(cbt $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gl();
   }
}

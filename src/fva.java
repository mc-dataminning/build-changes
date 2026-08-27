public abstract class fva<T extends ccg, M extends fkl<T>> extends fwt<T, M> {
   private static final agm a = new agm("textures/entity/zombie/zombie.png");

   protected fva(fwc.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gaa<>(this, $$2, $$3, $$0.g()));
   }

   public agm a(ccg $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gm();
   }
}

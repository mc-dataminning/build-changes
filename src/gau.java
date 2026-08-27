public abstract class gau<T extends cfz, M extends fpx<T>> extends gcp<T, M> {
   private static final ajc a = new ajc("textures/entity/zombie/zombie.png");

   protected gau(gby.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gfz<>(this, $$2, $$3, $$0.g()));
   }

   public ajc a(cfz $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gs();
   }
}

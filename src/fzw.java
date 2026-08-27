public abstract class fzw<T extends cfk, M extends fpb<T>> extends gbr<T, M> {
   private static final aiy a = new aiy("textures/entity/zombie/zombie.png");

   protected fzw(gba.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gfb<>(this, $$2, $$3, $$0.g()));
   }

   public aiy a(cfk $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gn();
   }
}

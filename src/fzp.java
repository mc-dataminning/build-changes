public abstract class fzp<T extends cfg, M extends fou<T>> extends gbk<T, M> {
   private static final aiy a = new aiy("textures/entity/zombie/zombie.png");

   protected fzp(gat.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new geu<>(this, $$2, $$3, $$0.g()));
   }

   public aiy a(cfg $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gn();
   }
}

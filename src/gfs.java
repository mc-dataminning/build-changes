public abstract class gfs<T extends cjg, M extends fut<T>> extends gho<T, M> {
   private static final akh a = new akh("textures/entity/zombie/zombie.png");

   protected gfs(ggx.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gky<>(this, $$2, $$3, $$0.g()));
   }

   public akh a(cjg $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gw();
   }
}

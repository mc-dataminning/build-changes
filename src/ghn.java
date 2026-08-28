public abstract class ghn<T extends ckr, M extends fwn<T>> extends gjj<T, M> {
   private static final alb a = new alb("textures/entity/zombie/zombie.png");

   protected ghn(gis.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gmu<>(this, $$2, $$3, $$0.g()));
   }

   public alb a(ckr $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gx();
   }
}

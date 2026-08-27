public abstract class ged<T extends chs, M extends fte<T>> extends gfz<T, M> {
   private static final ajt a = new ajt("textures/entity/zombie/zombie.png");

   protected ged(gfi.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gjj<>(this, $$2, $$3, $$0.g()));
   }

   public ajt a(chs $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gu();
   }
}

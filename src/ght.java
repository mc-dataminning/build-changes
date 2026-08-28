public abstract class ght<T extends ckx, M extends fwt<T>> extends gjp<T, M> {
   private static final alf a = new alf("textures/entity/zombie/zombie.png");

   protected ght(giy.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gna<>(this, $$2, $$3, $$0.g()));
   }

   public alf a(ckx $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gx();
   }
}

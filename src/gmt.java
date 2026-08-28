public abstract class gmt<T extends cmf, S extends gwr, M extends gar<S>> extends goq<T, S, M> {
   private static final alh a = alh.b("textures/entity/zombie/zombie.png");

   protected gmt(gnz.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new gsc<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public alh a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gk();
      $$1.b = $$0.gz();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}

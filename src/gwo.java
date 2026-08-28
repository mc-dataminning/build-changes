public abstract class gwo<T extends cqd, S extends hgv, M extends gkh<S>> extends gym<T, S, M> {
   private static final alr a = alr.b("textures/entity/zombie/zombie.png");

   protected gwo(gxv.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new hby<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public alr a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gl();
      $$1.b = $$0.gB();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}

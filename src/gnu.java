public abstract class gnu<T extends cmo, S extends gxs, M extends gbs<S>> extends gpr<T, S, M> {
   private static final all a = all.b("textures/entity/zombie/zombie.png");

   protected gnu(gpa.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new gtd<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public all a(S $$0) {
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

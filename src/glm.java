public abstract class glm<T extends clo, S extends gvj, M extends fzr<S>> extends gnj<T, S, M> {
   private static final alb a = alb.b("textures/entity/zombie/zombie.png");

   protected glm(gms.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new gqv<>(this, $$3, $$4, $$5, $$6, $$0.g()));
   }

   public alb a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gs();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}

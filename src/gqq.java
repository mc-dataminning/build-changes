public abstract class gqq<S extends gsu, M extends fxa<S>> extends grf<S, M> {
   public gqq(goo<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fcu $$0, ggv $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.p;
         M $$7 = this.c();
         fcy $$8 = $$1.getBuffer(ghe.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, gwb.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract alb a();

   protected abstract M c();
}

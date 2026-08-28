public abstract class gqb<T extends cma, S extends gzj> extends gsa<T, S, gda<S>> {
   public gqb(grj.a $$0, gef $$1, gef $$2, gef $$3) {
      this($$0, $$2, $$3, new gda<>($$0.a($$1)));
   }

   public gqb(grj.a $$0, gef $$1, gef $$2, gda<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gvn<>(this, new gda($$0.a($$1)), new gda($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gb();
      $$1.c = $$0.gn();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}

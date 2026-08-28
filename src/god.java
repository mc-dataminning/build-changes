public abstract class god<T extends clg, S extends gxj> extends gqb<T, S, gbe<S>> {
   public god(gpk.a $$0, gcj $$1, gcj $$2, gcj $$3) {
      this($$0, $$2, $$3, new gbe<>($$0.a($$1)));
   }

   public god(gpk.a $$0, gcj $$1, gcj $$2, gbe<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gto<>(this, new gbe($$0.a($$1)), new gbe($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gb();
      $$1.c = $$0.go();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}

public abstract class gqx<T extends clh, S extends hah> extends gsw<T, S, gdx<S>> {
   public gqx(gsf.a $$0, gfc $$1, gfc $$2, gfc $$3) {
      this($$0, $$2, $$3, new gdx<>($$0.a($$1)));
   }

   public gqx(gsf.a $$0, gfc $$1, gfc $$2, gdx<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gwj<>(this, new gdx($$0.a($$1)), new gdx($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gh();
      $$1.c = $$0.gt();
      $$1.d = $$0.eZ().a(cwu.pa);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gcp.a a(clh $$0, bvc $$1) {
      return $$0.fy() == $$1 && $$0.gh() && $$0.eZ().a(cwu.pa) ? gcp.a.d : gcp.a.a;
   }
}

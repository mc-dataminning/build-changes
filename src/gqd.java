public abstract class gqd<T extends clw, S extends gzl> extends gsc<T, S, gdc<S>> {
   public gqd(grl.a $$0, geh $$1, geh $$2, geh $$3) {
      this($$0, $$2, $$3, new gdc<>($$0.a($$1)));
   }

   public gqd(grl.a $$0, geh $$1, geh $$2, gdc<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gvp<>(this, new gdc($$0.a($$1)), new gdc($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gd();
      $$1.c = $$0.gp();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}

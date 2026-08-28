public abstract class gxi<T extends csh, S extends hdx> extends gyj<T, S> {
   private final ggv a;

   public gxi(gyk.a $$0) {
      super($$0);
      this.a = new ggv($$0.a(glf.l));
   }

   public void a(S $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      flt $$4 = $$2.getBuffer(gsn.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hks.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract alk a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

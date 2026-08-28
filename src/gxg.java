public abstract class gxg<T extends csf, S extends hdv> extends gyh<T, S> {
   private final ggt a;

   public gxg(gyi.a $$0) {
      super($$0);
      this.a = new ggt($$0.a(gld.l));
   }

   public void a(S $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      flr $$4 = $$2.getBuffer(gsl.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hkq.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract ali a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

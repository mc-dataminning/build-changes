public abstract class gvr<T extends crr, S extends hcf> extends gws<T, S> {
   private final gfd a;

   public gvr(gwt.a $$0) {
      super($$0);
      this.a = new gfd($$0.a(gjn.l));
   }

   public void a(S $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fkc $$4 = $$2.getBuffer(gqx.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hja.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract alg a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

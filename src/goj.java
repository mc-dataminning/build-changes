public abstract class goj<T extends cpb, S extends guw> extends gpj<T, S> {
   private final fyj a;

   public goj(gpk.a $$0) {
      super($$0);
      this.a = new fyj($$0.a(gck.l));
   }

   public void a(S $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fev $$4 = $$2.getBuffer(gjq.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, gyv.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract alj a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.d - $$2;
   }
}

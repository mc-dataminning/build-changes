public abstract class gwt<T extends csq, S extends hdi> extends gxu<T, S> {
   private final ggg a;

   public gwt(gxv.a $$0) {
      super($$0);
      this.a = new ggg($$0.a(gkq.l));
   }

   public void a(S $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      flg $$4 = $$2.getBuffer(gry.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hkg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract alr a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

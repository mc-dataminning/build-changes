public abstract class gqz<T extends cpc, S extends gxo> extends gsa<T, S> {
   private final gav a;

   public gqz(gsb.a $$0) {
      super($$0);
      this.a = new gav($$0.a(gez.l));
   }

   public void a(S $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      ffw $$4 = $$2.getBuffer(gmf.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hec.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract aku a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

public abstract class gmn<T extends coe, S extends gsy> extends gnn<T, S> {
   private final fwo a;

   public gmn(gno.a $$0) {
      super($$0);
      this.a = new fwo($$0.a(gap.j));
   }

   public void a(S $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fdm $$4 = $$2.getBuffer(ghv.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, gwx.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract ale a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.e - $$2;
   }
}

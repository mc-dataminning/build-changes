public abstract class gnj<T extends cou, S extends gtv> extends goj<T, S> {
   private final fxk a;

   public gnj(gok.a $$0) {
      super($$0);
      this.a = new fxk($$0.a(gbl.j));
   }

   public void a(S $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fef $$4 = $$2.getBuffer(gir.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, gxu.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract ali a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.e - $$2;
   }
}

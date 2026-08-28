public abstract class gnz<T extends coy, S extends gul> extends goz<T, S> {
   private final fya a;

   public gnz(gpa.a $$0) {
      super($$0);
      this.a = new fya($$0.a(gcb.j));
   }

   public void a(S $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      feo $$4 = $$2.getBuffer(gjh.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, gyk.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract all a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.e - $$2;
   }
}

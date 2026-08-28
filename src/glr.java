public abstract class glr<T extends cnw, S extends gsc> extends gmr<T, S> {
   private final fwa a;

   public glr(gms.a $$0) {
      super($$0);
      this.a = new fwa($$0.a(gaa.j));
   }

   public void a(S $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fcy $$4 = $$2.getBuffer(ghe.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, gwb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.e - $$2;
   }
}

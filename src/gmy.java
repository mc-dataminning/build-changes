public abstract class gmy<T extends cop, S extends gtk> extends gny<T, S> {
   private final fwz a;

   public gmy(gnz.a $$0) {
      super($$0);
      this.a = new fwz($$0.a(gba.j));
   }

   public void a(S $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fdx $$4 = $$2.getBuffer(gig.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, gxj.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract alh a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.e - $$2;
   }
}

public abstract class gmi<T extends cob, S extends gst> extends gni<T, S> {
   private final fwk a;

   public gmi(gnj.a $$0) {
      super($$0);
      this.a = new fwk($$0.a(gak.j));
   }

   public void a(S $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fdi $$4 = $$2.getBuffer(ghq.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, gws.d);
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

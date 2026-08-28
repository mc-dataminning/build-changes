public abstract class grd<T extends cpf, S extends gxs> extends gse<T, S> {
   private final gaz a;

   public grd(gsf.a $$0) {
      super($$0);
      this.a = new gaz($$0.a(gfd.l));
   }

   public void a(S $$0, ffv $$1, glz $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      ffz $$4 = $$2.getBuffer(gmj.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hej.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract akv a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

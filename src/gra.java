public abstract class gra<T extends cpe, S extends gxp> extends gsb<T, S> {
   private final gax a;

   public gra(gsc.a $$0) {
      super($$0);
      this.a = new gax($$0.a(gfb.l));
   }

   public void a(S $$0, ffu $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      ffy $$4 = $$2.getBuffer(gmh.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hea.d);
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

public abstract class grc<T extends cpe, S extends gxr> extends gsd<T, S> {
   private final gay a;

   public grc(gse.a $$0) {
      super($$0);
      this.a = new gay($$0.a(gfc.l));
   }

   public void a(S $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      ffy $$4 = $$2.getBuffer(gmi.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hei.d);
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

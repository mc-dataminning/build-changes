public abstract class gsb<T extends cpy, S extends gyq> extends gtc<T, S> {
   private final gbw a;

   public gsb(gtd.a $$0) {
      super($$0);
      this.a = new gbw($$0.a(ggb.l));
   }

   public void a(S $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fgv $$4 = $$2.getBuffer(gnh.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hfh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract aku a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

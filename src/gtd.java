public abstract class gtd<T extends cqp, S extends gzr> extends gue<T, S> {
   private final gcv a;

   public gtd(guf.a $$0) {
      super($$0);
      this.a = new gcv($$0.a(ghc.l));
   }

   public void a(S $$0, fho $$1, gny $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fhs $$4 = $$2.getBuffer(goi.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hgi.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract ald a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

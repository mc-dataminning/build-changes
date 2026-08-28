public abstract class gvf<T extends crk, S extends hbt> extends gwg<T, S> {
   private final ger a;

   public gvf(gwh.a $$0) {
      super($$0);
      this.a = new ger($$0.a(gjb.l));
   }

   public void a(S $$0, fjj $$1, gqa $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fjn $$4 = $$2.getBuffer(gqk.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hin.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract alg a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

public abstract class gui<T extends cqz, S extends haw> extends gvj<T, S> {
   private final gdy a;

   public gui(gvk.a $$0) {
      super($$0);
      this.a = new gdy($$0.a(gif.l));
   }

   public void a(S $$0, fiq $$1, gpd $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fiu $$4 = $$2.getBuffer(gpn.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hhp.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract ale a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = (float)$$0.c - $$2;
   }
}

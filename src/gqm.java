public abstract class gqm<T extends cqd, S extends gxa> extends grn<T, S> {
   private final gaj a;

   public gqm(gro.a $$0) {
      super($$0);
      this.a = new gaj($$0.a(gel.l));
   }

   public void a(S $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fgu $$4 = $$2.getBuffer(glt.e(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hba.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract alz a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j($$2);
      $$1.b = $$0.k($$2);
      $$1.c = (float)$$0.d - $$2;
   }
}

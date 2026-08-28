public abstract class gqo<T extends cqe, S extends gxc> extends grp<T, S> {
   private final gal a;

   public gqo(grq.a $$0) {
      super($$0);
      this.a = new gal($$0.a(gen.l));
   }

   public void a(S $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fgw $$4 = $$2.getBuffer(glv.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hbc.d);
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

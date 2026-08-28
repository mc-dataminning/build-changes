public abstract class gqn<T extends cqd, S extends gxb> extends gro<T, S> {
   private final gak a;

   public gqn(grp.a $$0) {
      super($$0);
      this.a = new gak($$0.a(gem.l));
   }

   public void a(S $$0, fgr $$1, glk $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fgv $$4 = $$2.getBuffer(glu.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hbb.d);
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

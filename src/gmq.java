public class gmq extends gkc<coa> {
   public static final akq a = akq.b("textures/entity/trident.png");
   private final fxj f;

   public gmq(gkd.a $$0) {
      super($$0);
      this.f = new fxj($$0.a(fyd.bJ));
   }

   public void a(coa $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayn.i($$2, $$0.O, $$0.dG()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayn.i($$2, $$0.P, $$0.dI()) + 90.0F));
      fbg $$6 = glb.b($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gpw.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akq a(coa $$0) {
      return a;
   }
}

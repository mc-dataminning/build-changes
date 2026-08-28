public class gmu extends gkg<coc> {
   public static final akr a = akr.b("textures/entity/trident.png");
   private final fxn g;

   public gmu(gkh.a $$0) {
      super($$0);
      this.g = new fxn($$0.a(fyh.bJ));
   }

   public void a(coc $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayo.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayo.i($$2, $$0.P, $$0.dH()) + 90.0F));
      fbk $$6 = glf.b($$4, this.g.a(this.a($$0)), false, $$0.F());
      this.g.a($$3, $$6, $$5, gqa.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(coc $$0) {
      return a;
   }
}

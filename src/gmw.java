public class gmw extends gki<coc> {
   public static final akr a = akr.b("textures/entity/trident.png");
   private final fxp g;

   public gmw(gkj.a $$0) {
      super($$0);
      this.g = new fxp($$0.a(fyj.bJ));
   }

   public void a(coc $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayo.i($$2, $$0.O, $$0.dE()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayo.i($$2, $$0.P, $$0.dG()) + 90.0F));
      fbm $$6 = glh.b($$4, this.g.a(this.a($$0)), false, $$0.F());
      this.g.a($$3, $$6, $$5, gqc.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(coc $$0) {
      return a;
   }
}

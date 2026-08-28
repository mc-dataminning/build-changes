public class glg extends gkc<cnm> {
   private static final akq a = akq.b("textures/entity/llama/spit.png");
   private final fvy<cnm> f;

   public glg(gkd.a $$0) {
      super($$0);
      this.f = new fvy<>($$0.a(fyd.aA));
   }

   public void a(cnm $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayn.i($$2, $$0.O, $$0.dG()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayn.i($$2, $$0.P, $$0.dI())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fbg $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gpw.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akq a(cnm $$0) {
      return a;
   }
}

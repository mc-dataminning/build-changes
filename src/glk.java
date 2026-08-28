public class glk extends gkg<cno> {
   private static final akr a = akr.b("textures/entity/llama/spit.png");
   private final fwc<cno> g;

   public glk(gkh.a $$0) {
      super($$0);
      this.g = new fwc<>($$0.a(fyh.aA));
   }

   public void a(cno $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayo.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayo.i($$2, $$0.P, $$0.dH())));
      this.g.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fbk $$6 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$6, $$5, gqa.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cno $$0) {
      return a;
   }
}

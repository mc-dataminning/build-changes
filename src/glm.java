public class glm extends gki<cno> {
   private static final akr a = akr.b("textures/entity/llama/spit.png");
   private final fwe<cno> g;

   public glm(gkj.a $$0) {
      super($$0);
      this.g = new fwe<>($$0.a(fyj.aA));
   }

   public void a(cno $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayo.i($$2, $$0.O, $$0.dE()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayo.i($$2, $$0.P, $$0.dG())));
      this.g.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fbm $$6 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$6, $$5, gqc.d);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cno $$0) {
      return a;
   }
}

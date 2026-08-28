public class gmi extends gki<cns> {
   private static final akr a = akr.b("textures/entity/shulker/spark.png");
   private static final gfh g = gfh.i(a);
   private final fxc<cns> h;

   public gmi(gkj.a $$0) {
      super($$0);
      this.h = new fxc<>($$0.a(fyj.bm));
   }

   protected int a(cns $$0, jd $$1) {
      return 15;
   }

   public void a(cns $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      float $$6 = ayo.j($$2, $$0.O, $$0.dE());
      float $$7 = ayo.i($$2, $$0.P, $$0.dG());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayo.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ayo.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ayo.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      fbm $$9 = $$4.getBuffer(this.h.a(a));
      this.h.a($$3, $$9, $$5, gqc.d);
      $$3.b(1.5F, 1.5F, 1.5F);
      fbm $$10 = $$4.getBuffer(g);
      this.h.a($$3, $$10, $$5, gqc.d, 654311423);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cns $$0) {
      return a;
   }
}

public class gtq extends grp<cqt, gzo> {
   private static final alz a = alz.b("textures/entity/shulker/spark.png");
   private static final glv b = glv.j(a);
   private final gde h;

   public gtq(grq.a $$0) {
      super($$0);
      this.h = new gde($$0.a(gen.cD));
   }

   protected int a(cqt $$0, jh $$1) {
      return 15;
   }

   public void a(gzo $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(bae.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(bae.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(bae.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fgw $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hbc.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fgw $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, hbc.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzo a() {
      return new gzo();
   }

   public void a(cqt $$0, gzo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}

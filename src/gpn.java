public class gpn extends gnn<cou, gvj> {
   private static final ale a = ale.b("textures/entity/shulker/spark.png");
   private static final ghv b = ghv.i(a);
   private final fzg h;

   public gpn(gno.a $$0) {
      super($$0);
      this.h = new fzg($$0.a(gap.ck));
   }

   protected int a(cou $$0, jf $$1) {
      return 15;
   }

   public void a(gvj $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azf.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azf.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azf.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fdm $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, gwx.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fdm $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, gwx.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvj a() {
      return new gvj();
   }

   public void a(cou $$0, gvj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}

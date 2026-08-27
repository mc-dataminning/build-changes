public class gjs extends ghs<cmt> {
   private static final akn a = new akn("textures/entity/shulker/spark.png");
   private static final gcs f = gcs.i(a);
   private final fuo<cmt> g;

   public gjs(ght.a $$0) {
      super($$0);
      this.g = new fuo<>($$0.a(fvv.bl));
   }

   protected int a(cmt $$0, io $$1) {
      return 15;
   }

   public void a(cmt $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      $$3.a();
      float $$6 = ayf.j($$2, $$0.O, $$0.dF());
      float $$7 = ayf.i($$2, $$0.P, $$0.dH());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayf.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ayf.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ayf.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eyy $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eyy $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akn a(cmt $$0) {
      return a;
   }
}

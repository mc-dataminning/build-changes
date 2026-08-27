public class fzi extends fye<cfs> {
   private static final ahd a = new ahd("textures/entity/llama/spit.png");
   private final fkj<cfs> f;

   public fzi(fyf.a $$0) {
      super($$0);
      this.f = new fkj<>($$0.a(fmo.aw));
   }

   public void a(cfs $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aui.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aui.i($$2, $$0.O, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      epx $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahd a(cfs $$0) {
      return a;
   }
}

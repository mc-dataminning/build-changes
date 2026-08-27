public class fuz extends ftp<bvi, fec<bvi>> {
   private final fec<bvi> a = this.a();
   private final fec<bvi> i;
   private static final aep j = new aep("textures/entity/fish/tropical_a.png");
   private static final aep k = new aep("textures/entity/fish/tropical_b.png");

   public fuz(fsj.a $$0) {
      super($$0, new fgq<>($$0.a(fhi.bF)), 0.15F);
      this.i = new fgr<>($$0.a(fhi.bD));
      this.a(new fxb(this, $$0.f()));
   }

   public aep a(bvi $$0) {
      return switch ($$0.gk().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bvi $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      fec<bvi> $$6 = switch ($$0.gk().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gi().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bvi $$0, elh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aro.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

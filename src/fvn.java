public class fvn extends fud<bvj, fel<bvj>> {
   private final fel<bvj> a = this.a();
   private final fel<bvj> i;
   private static final aer j = new aer("textures/entity/fish/tropical_a.png");
   private static final aer k = new aer("textures/entity/fish/tropical_b.png");

   public fvn(fsx.a $$0) {
      super($$0, new fgz<>($$0.a(fhr.bF)), 0.15F);
      this.i = new fha<>($$0.a(fhr.bD));
      this.a(new fxp(this, $$0.f()));
   }

   public aer a(bvj $$0) {
      return switch ($$0.gl().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bvj $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      fel<bvj> $$6 = switch ($$0.gl().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gj().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bvj $$0, elf $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * arp.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

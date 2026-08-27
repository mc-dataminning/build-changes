public class fvs extends fui<bvm, feq<bvm>> {
   private final feq<bvm> a = this.a();
   private final feq<bvm> i;
   private static final aeu j = new aeu("textures/entity/fish/tropical_a.png");
   private static final aeu k = new aeu("textures/entity/fish/tropical_b.png");

   public fvs(ftc.a $$0) {
      super($$0, new fhe<>($$0.a(fhw.bF)), 0.15F);
      this.i = new fhf<>($$0.a(fhw.bD));
      this.a(new fxu(this, $$0.f()));
   }

   public aeu a(bvm $$0) {
      return switch ($$0.gl().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bvm $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      feq<bvm> $$6 = switch ($$0.gl().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gj().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bvm $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * ars.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

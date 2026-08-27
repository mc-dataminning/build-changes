public class gdq extends gcg<cax, fma<cax>> {
   private final fma<cax> a = this.a();
   private final fma<cax> i;
   private static final aiy j = new aiy("textures/entity/fish/tropical_a.png");
   private static final aiy k = new aiy("textures/entity/fish/tropical_b.png");

   public gdq(gba.a $$0) {
      super($$0, new foo<>($$0.a(fpi.bH)), 0.15F);
      this.i = new fop<>($$0.a(fpi.bF));
      this.a(new gfv(this, $$0.f()));
   }

   public aiy a(cax $$0) {
      return switch ($$0.gr().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cax $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      fma<cax> $$6 = switch ($$0.gr().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gp().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cax $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * awi.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

public class gkk extends giz<cfe, fso<cfe>> {
   private final fso<cfe> a = this.a();
   private final fso<cfe> i;
   private static final akm j = new akm("textures/entity/fish/tropical_a.png");
   private static final akm k = new akm("textures/entity/fish/tropical_b.png");

   public gkk(ght.a $$0) {
      super($$0, new fvc<>($$0.a(fvv.bL)), 0.15F);
      this.i = new fvd<>($$0.a(fvv.bJ));
      this.a(new gmp(this, $$0.f()));
   }

   public akm a(cfe $$0) {
      return switch ($$0.gA().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cfe $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      fso<cfe> $$6 = switch ($$0.gA().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gy().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cfe $$0, eys $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayd.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

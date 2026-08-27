public class gbd extends fzt<byy, fjp<byy>> {
   private final fjp<byy> a = this.a();
   private final fjp<byy> i;
   private static final ahg j = new ahg("textures/entity/fish/tropical_a.png");
   private static final ahg k = new ahg("textures/entity/fish/tropical_b.png");

   public gbd(fyn.a $$0) {
      super($$0, new fmd<>($$0.a(fmw.bI)), 0.15F);
      this.i = new fme<>($$0.a(fmw.bG));
      this.a(new gdi(this, $$0.f()));
   }

   public ahg a(byy $$0) {
      return switch ($$0.gp().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(byy $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      fjp<byy> $$6 = switch ($$0.gp().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gn().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(byy $$0, eqb $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * auo.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

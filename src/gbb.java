public class gbb extends fzr<byx, fjn<byx>> {
   private final fjn<byx> a = this.a();
   private final fjn<byx> i;
   private static final ahg j = new ahg("textures/entity/fish/tropical_a.png");
   private static final ahg k = new ahg("textures/entity/fish/tropical_b.png");

   public gbb(fyl.a $$0) {
      super($$0, new fmb<>($$0.a(fmu.bI)), 0.15F);
      this.i = new fmc<>($$0.a(fmu.bG));
      this.a(new gdg(this, $$0.f()));
   }

   public ahg a(byx $$0) {
      return switch ($$0.gp().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(byx $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      fjn<byx> $$6 = switch ($$0.gp().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gn().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(byx $$0, epz $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aun.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

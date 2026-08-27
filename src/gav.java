public class gav extends fzl<bys, fjh<bys>> {
   private final fjh<bys> a = this.a();
   private final fjh<bys> i;
   private static final ahd j = new ahd("textures/entity/fish/tropical_a.png");
   private static final ahd k = new ahd("textures/entity/fish/tropical_b.png");

   public gav(fyf.a $$0) {
      super($$0, new flv<>($$0.a(fmo.bI)), 0.15F);
      this.i = new flw<>($$0.a(fmo.bG));
      this.a(new gda(this, $$0.f()));
   }

   public ahd a(bys $$0) {
      return switch ($$0.gp().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bys $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      fjh<bys> $$6 = switch ($$0.gp().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gn().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bys $$0, ept $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aui.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

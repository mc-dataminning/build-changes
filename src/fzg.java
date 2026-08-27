public class fzg extends fzr<byj, fkk<byj>> {
   private static final ahg a = new ahg("textures/entity/iron_golem/iron_golem.png");

   public fzg(fyl.a $$0) {
      super($$0, new fkk<>($$0.a(fmu.as)), 0.7F);
      this.a(new gcn(this));
      this.a(new gco(this, $$0.c()));
   }

   public ahg a(byj $$0) {
      return a;
   }

   protected void a(byj $$0, epz $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!((double)$$0.aQ.a() < 0.01)) {
         float $$5 = 13.0F;
         float $$6 = $$0.aQ.c($$4) + 6.0F;
         float $$7 = (Math.abs($$6 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$7));
      }
   }
}

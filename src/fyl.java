public class fyl extends fxi<cca, fjx<cca>> {
   private static final agm a = new agm("textures/entity/strider/strider.png");
   private static final agm i = new agm("textures/entity/strider/strider_cold.png");

   public fyl(fwc.a $$0) {
      super($$0, new fjx<>($$0.a(fks.bx)), 0.5F);
      this.a(new gal<>(this, new fjx<>($$0.a(fks.by)), new agm("textures/entity/strider/strider_saddle.png")));
   }

   public agm a(cca $$0) {
      return $$0.u() ? i : a;
   }

   protected void a(cca $$0, eob $$1, float $$2) {
      if ($$0.o_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(cca $$0) {
      return super.a($$0) || $$0.u();
   }
}

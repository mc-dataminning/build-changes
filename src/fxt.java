public class fxt extends fwq<cbn, fjf<cbn>> {
   private static final agg a = new agg("textures/entity/strider/strider.png");
   private static final agg i = new agg("textures/entity/strider/strider_cold.png");

   public fxt(fvk.a $$0) {
      super($$0, new fjf<>($$0.a(fka.bx)), 0.5F);
      this.a(new fzt<>(this, new fjf<>($$0.a(fka.by)), new agg("textures/entity/strider/strider_saddle.png")));
   }

   public agg a(cbn $$0) {
      return $$0.s() ? i : a;
   }

   protected void a(cbn $$0, enk $$1, float $$2) {
      if ($$0.n_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(cbn $$0) {
      return super.a($$0) || $$0.s();
   }
}

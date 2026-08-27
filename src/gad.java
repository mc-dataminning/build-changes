public class gad extends fzr<byq, fjv<byq>> {
   private static final ahg a = new ahg("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fjv<byq> j;
   private final fjv<byq> k;
   private final fjv<byq> l = this.a();

   public gad(fyl.a $$0) {
      super($$0, new flc<>($$0.a(fmu.aY)), 0.2F);
      this.k = new fld<>($$0.a(fmu.aZ));
      this.j = new fle<>($$0.a(fmu.ba));
   }

   public ahg a(byq $$0) {
      return a;
   }

   public void a(byq $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      int $$6 = $$0.gg();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(byq $$0, epz $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, aun.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}

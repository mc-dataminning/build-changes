public class fzx extends fzl<byl, fjp<byl>> {
   private static final ahd a = new ahd("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fjp<byl> j;
   private final fjp<byl> k;
   private final fjp<byl> l = this.a();

   public fzx(fyf.a $$0) {
      super($$0, new fkw<>($$0.a(fmo.aY)), 0.2F);
      this.k = new fkx<>($$0.a(fmo.aZ));
      this.j = new fky<>($$0.a(fmo.ba));
   }

   public ahd a(byl $$0) {
      return a;
   }

   public void a(byl $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
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

   protected void a(byl $$0, ept $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, aui.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}

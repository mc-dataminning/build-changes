public class gko extends gkb<cfw, fty<cfw>> {
   private static final ale a = new ale("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fty<cfw> j;
   private final fty<cfw> k;
   private final fty<cfw> l = this.a();

   public gko(giv.a $$0) {
      super($$0, new fvf<>($$0.a(fwx.bb)), 0.2F);
      this.k = new fvg<>($$0.a(fwx.bc));
      this.j = new fvh<>($$0.a(fwx.bd));
   }

   public ale a(cfw $$0) {
      return a;
   }

   public void a(cfw $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      int $$6 = $$0.gs();
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

   protected void a(cfw $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayx.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}

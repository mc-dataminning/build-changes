public class gxd extends gwq<cjj, hdd, gfd<hbp>> {
   private static final ale a = ale.b("textures/entity/fish/pufferfish.png");
   private final gfd<hbp> j;
   private final gfd<hbp> k;
   private final gfd<hbp> l = this.c();

   public gxd(gvk.a $$0) {
      super($$0, new ggl($$0.a(gif.cA)), 0.2F);
      this.k = new ggm($$0.a(gif.cB));
      this.j = new ggn($$0.a(gif.cC));
   }

   public ale a(hdd $$0) {
      return a;
   }

   public hdd b() {
      return new hdd();
   }

   protected float b(hdd $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hdd $$0, fiq $$1, gpd $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjj $$0, hdd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(hdd $$0, fiq $$1, float $$2, float $$3) {
      $$1.a(0.0F, azk.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}

public class gzo extends gzb<cku, hfs, ghn<hec>> {
   private static final alr a = alr.b("textures/entity/fish/pufferfish.png");
   private final ghn<hec> j;
   private final ghn<hec> k;
   private final ghn<hec> l = this.c();

   public gzo(gxv.a $$0) {
      super($$0, new giv($$0.a(gkq.cE)), 0.2F);
      this.k = new giw($$0.a(gkq.cF));
      this.j = new gix($$0.a(gkq.cG));
   }

   public alr a(hfs $$0) {
      return a;
   }

   public hfs b() {
      return new hfs();
   }

   protected float b(hfs $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hfs $$0, fld $$1, grn $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cku $$0, hfs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   protected void a(hfs $$0, fld $$1, float $$2, float $$3) {
      $$1.a(0.0F, azz.b($$0.v * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}

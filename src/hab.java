public class hab extends gzo<ckj, hgd, gia<hep>> {
   private static final ali a = ali.b("textures/entity/fish/pufferfish.png");
   private final gia<hep> j;
   private final gia<hep> k;
   private final gia<hep> l = this.c();

   public hab(gyi.a $$0) {
      super($$0, new gji($$0.a(gld.cE)), 0.2F);
      this.k = new gjj($$0.a(gld.cF));
      this.j = new gjk($$0.a(gld.cG));
   }

   public ali a(hgd $$0) {
      return a;
   }

   public hgd b() {
      return new hgd();
   }

   protected float b(hgd $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hgd $$0, flo $$1, gsa $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(ckj $$0, hgd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(hgd $$0, flo $$1, float $$2, float $$3) {
      $$1.a(0.0F, azo.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}

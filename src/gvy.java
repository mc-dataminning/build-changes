public class gvy extends gvl<cjb, hby, gea<hak>> {
   private static final ald a = ald.b("textures/entity/fish/pufferfish.png");
   private final gea<hak> j;
   private final gea<hak> k;
   private final gea<hak> l = this.c();

   public gvy(guf.a $$0) {
      super($$0, new gfi($$0.a(ghc.cA)), 0.2F);
      this.k = new gfj($$0.a(ghc.cB));
      this.j = new gfk($$0.a(ghc.cC));
   }

   public ald a(hby $$0) {
      return a;
   }

   public hby b() {
      return new hby();
   }

   protected float b(hby $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(hby $$0, fho $$1, gny $$2, int $$3) {
      this.g = switch ($$0.a) {
         case 0 -> this.j;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cjb $$0, hby $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
   }

   protected void a(hby $$0, fho $$1, float $$2, float $$3) {
      $$1.a(0.0F, azk.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}

public class gwd extends gvl<cjd, hcb, gfp> {
   private static final ald a = ald.b("textures/entity/fish/salmon.png");
   private final gfp j;
   private final gfp k;
   private final gfp l;

   public gwd(guf.a $$0) {
      super($$0, new gfp($$0.a(ghc.cG)), 0.4F);
      this.j = new gfp($$0.a(ghc.cI));
      this.k = new gfp($$0.a(ghc.cG));
      this.l = new gfp($$0.a(ghc.cH));
   }

   public void a(cjd $$0, hcb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   public ald a(hcb $$0) {
      return a;
   }

   public hcb b() {
      return new hcb();
   }

   protected void a(hcb $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * azk.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hcb $$0, fho $$1, gny $$2, int $$3) {
      if ($$0.a == cjd.a.a) {
         this.g = this.j;
      } else if ($$0.a == cjd.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

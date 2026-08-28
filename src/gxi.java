public class gxi extends gwq<cjl, hdg, ggs> {
   private static final ale a = ale.b("textures/entity/fish/salmon.png");
   private final ggs j;
   private final ggs k;
   private final ggs l;

   public gxi(gvk.a $$0) {
      super($$0, new ggs($$0.a(gif.cG)), 0.4F);
      this.j = new ggs($$0.a(gif.cI));
      this.k = new ggs($$0.a(gif.cG));
      this.l = new ggs($$0.a(gif.cH));
   }

   public void a(cjl $$0, hdg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
   }

   public ale a(hdg $$0) {
      return a;
   }

   public hdg b() {
      return new hdg();
   }

   protected void a(hdg $$0, fiq $$1, float $$2, float $$3) {
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

   public void a(hdg $$0, fiq $$1, gpd $$2, int $$3) {
      if ($$0.a == cjl.a.a) {
         this.g = this.j;
      } else if ($$0.a == cjl.a.c) {
         this.g = this.l;
      } else {
         this.g = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

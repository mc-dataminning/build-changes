public class gvb extends guj<cim, hbb, geo> {
   private static final aku a = aku.b("textures/entity/fish/salmon.png");
   private final geo b;
   private final geo k;
   private final geo l;

   public gvb(gtd.a $$0) {
      super($$0, new geo($$0.a(ggb.cy)), 0.4F);
      this.b = new geo($$0.a(ggb.cA));
      this.k = new geo($$0.a(ggb.cy));
      this.l = new geo($$0.a(ggb.cz));
   }

   public void a(cim $$0, hbb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }

   public aku a(hbb $$0) {
      return a;
   }

   public hbb b() {
      return new hbb();
   }

   protected void a(hbb $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.ak) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * ayz.a($$5 * 0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hbb $$0, fgr $$1, gmx $$2, int $$3) {
      if ($$0.a == cim.a.a) {
         this.h = this.b;
      } else if ($$0.a == cim.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

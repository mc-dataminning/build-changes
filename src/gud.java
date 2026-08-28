public class gud extends gtl<chu, had, gdq> {
   private static final akv a = akv.b("textures/entity/fish/salmon.png");
   private final gdq b;
   private final gdq k;
   private final gdq l;

   public gud(gsf.a $$0) {
      super($$0, new gdq($$0.a(gfd.cw)), 0.4F);
      this.b = new gdq($$0.a(gfd.cy));
      this.k = new gdq($$0.a(gfd.cw));
      this.l = new gdq($$0.a(gfd.cx));
   }

   public void a(chu $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }

   public akv a(had $$0) {
      return a;
   }

   public had b() {
      return new had();
   }

   protected void a(had $$0, ffv $$1, float $$2, float $$3) {
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

   public void a(had $$0, ffv $$1, glz $$2, int $$3) {
      if ($$0.a == chu.a.a) {
         this.h = this.b;
      } else if ($$0.a == chu.a.c) {
         this.h = this.l;
      } else {
         this.h = this.k;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

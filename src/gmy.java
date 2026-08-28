public class gmy extends gln<cge, fva<cge>> {
   private final fva<cge> a = this.a();
   private final fva<cge> i;
   private static final akr j = akr.b("textures/entity/fish/tropical_a.png");
   private static final akr k = akr.b("textures/entity/fish/tropical_b.png");

   public gmy(gkh.a $$0) {
      super($$0, new fxo<>($$0.a(fyh.bM)), 0.15F);
      this.i = new fxp<>($$0.a(fyh.bK));
      this.a(new gpd(this, $$0.f()));
   }

   public akr a(cge $$0) {
      return switch ($$0.gw().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cge $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      fva<cge> $$6 = switch ($$0.gw().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.g = $$6;
      $$6.a($$0.gu().d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(-1);
   }

   protected void a(cge $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayo.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bf()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

public class gna extends glp<cge, fvc<cge>> {
   private final fvc<cge> a = this.a();
   private final fvc<cge> i;
   private static final akr j = akr.b("textures/entity/fish/tropical_a.png");
   private static final akr k = akr.b("textures/entity/fish/tropical_b.png");

   public gna(gkj.a $$0) {
      super($$0, new fxq<>($$0.a(fyj.bM)), 0.15F);
      this.i = new fxr<>($$0.a(fyj.bK));
      this.a(new gpf(this, $$0.f()));
   }

   public akr a(cge $$0) {
      return switch ($$0.gv().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cge $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      fvc<cge> $$6 = switch ($$0.gv().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.g = $$6;
      $$6.a($$0.gt().d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(-1);
   }

   protected void a(cge $$0, fbi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayo.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bf()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

public class gsc extends gqq<chy, gxt, fzj<gxt>> {
   private final fzj<gxt> a = this.c();
   private final fzj<gxt> b;
   private static final alj k = alj.b("textures/entity/fish/tropical_a.png");
   private static final alj l = alj.b("textures/entity/fish/tropical_b.png");

   public gsc(gpk.a $$0) {
      super($$0, new gbq($$0.a(gck.dg)), 0.15F);
      this.b = new gbr($$0.a(gck.de));
      this.a(new guh(this, $$0.f()));
   }

   public alj a(gxt $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gxt b() {
      return new gxt();
   }

   public void a(chy $$0, gxt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
      $$1.b = $$0.gv().d();
      $$1.c = $$0.gw().d();
   }

   public void a(gxt $$0, fer $$1, gjg $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gxt $$0) {
      return $$0.b;
   }

   protected void a(gxt $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

public class gpj extends gny<cgv, guz, fxa<guz>> {
   private final fxa<guz> a = this.e();
   private final fxa<guz> b;
   private static final alb k = alb.b("textures/entity/fish/tropical_a.png");
   private static final alb l = alb.b("textures/entity/fish/tropical_b.png");

   public gpj(gms.a $$0) {
      super($$0, new fzg($$0.a(gaa.cN)), 0.15F);
      this.b = new fzh($$0.a(gaa.cL));
      this.a(new gro(this, $$0.f()));
   }

   public alb a(guz $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public guz c() {
      return new guz();
   }

   public void a(cgv $$0, guz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
      $$1.b = $$0.gx().d();
      $$1.c = $$0.gy().d();
   }

   public void a(guz $$0, fcu $$1, ggv $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(guz $$0) {
      return $$0.b;
   }

   protected void a(guz $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azc.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

public class gzu extends gvs<cqy, hfp, gjc> {
   private static final alg j = alg.b("textures/entity/villager/villager.png");
   public static final har.a a = new har.a(-0.1171875F, -0.07421875F, 1.0F);

   public gzu(gwy.a $$0) {
      super($$0, new gjc($$0.a(gjs.dL)), new gjc($$0.a(gjs.dM)), 0.5F);
      this.a(new har<>(this, $$0.f(), a));
      this.a(new hbx<>(this, $$0.e(), "villager"));
      this.a(new haq<>(this));
   }

   public alg a(hfp $$0) {
      return j;
   }

   protected float b(hfp $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hfp b() {
      return new hfp();
   }

   public void a(cqy $$0, hfp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdu.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gB();
   }
}

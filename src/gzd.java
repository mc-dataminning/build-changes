public class gzd extends gvb<cqo, hex, gil> {
   private static final alg j = alg.b("textures/entity/villager/villager.png");
   public static final haa.a a = new haa.a(-0.1171875F, -0.07421875F, 1.0F);

   public gzd(gwh.a $$0) {
      super($$0, new gil($$0.a(gjb.dJ)), new gil($$0.a(gjb.dK)), 0.5F);
      this.a(new haa<>(this, $$0.f(), a));
      this.a(new hbf<>(this, $$0.e(), "villager"));
      this.a(new gzz<>(this));
   }

   public alg a(hex $$0) {
      return j;
   }

   protected float b(hex $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hex b() {
      return new hex();
   }

   public void a(cqo $$0, hex $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdc.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gz();
   }
}

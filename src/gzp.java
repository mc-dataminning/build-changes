public class gzp extends gvn<cqv, hfj, gix> {
   private static final alg j = alg.b("textures/entity/villager/villager.png");
   public static final ham.a a = new ham.a(-0.1171875F, -0.07421875F, 1.0F);

   public gzp(gwt.a $$0) {
      super($$0, new gix($$0.a(gjn.dJ)), new gix($$0.a(gjn.dK)), 0.5F);
      this.a(new ham<>(this, $$0.f(), a));
      this.a(new hbr<>(this, $$0.e(), "villager"));
      this.a(new hal<>(this));
   }

   public alg a(hfj $$0) {
      return j;
   }

   protected float b(hfj $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hfj b() {
      return new hfj();
   }

   public void a(cqv $$0, hfj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdo.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gB();
   }
}

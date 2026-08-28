public class gyv extends gut<cqk, hep, gid> {
   private static final alg j = alg.b("textures/entity/villager/villager.png");
   public static final gzs.a a = new gzs.a(-0.1171875F, -0.07421875F, 1.0F);

   public gyv(gvz.a $$0) {
      super($$0, new gid($$0.a(git.dH)), new gid($$0.a(git.dI)), 0.5F);
      this.a(new gzs<>(this, $$0.f(), a));
      this.a(new hax<>(this, $$0.e(), "villager"));
      this.a(new gzr<>(this));
   }

   public alg a(hep $$0) {
      return j;
   }

   protected float b(hep $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hep b() {
      return new hep();
   }

   public void a(cqk $$0, hep $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hcu.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gy();
   }
}

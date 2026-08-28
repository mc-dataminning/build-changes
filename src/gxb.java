public class gxb extends gsz<cpu, hcu, ggn> {
   private static final ald j = ald.b("textures/entity/villager/villager.png");
   public static final gxy.a a = new gxy.a(-0.1171875F, -0.07421875F, 1.0F);

   public gxb(guf.a $$0) {
      super($$0, new ggn($$0.a(ghc.dF)), new ggn($$0.a(ghc.dG)), 0.5F);
      this.a(new gxy<>(this, $$0.f(), a));
      this.a(new gzd<>(this, $$0.e(), "villager"));
      this.a(new gxx<>(this));
   }

   public ald a(hcu $$0) {
      return j;
   }

   protected float b(hcu $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hcu b() {
      return new hcu();
   }

   public void a(cpu $$0, hcu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      haz.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gy();
   }
}

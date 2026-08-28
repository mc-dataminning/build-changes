public class gyg extends gue<cqe, hdz, ghq> {
   private static final ale j = ale.b("textures/entity/villager/villager.png");
   public static final gzd.a a = new gzd.a(-0.1171875F, -0.07421875F, 1.0F);

   public gyg(gvk.a $$0) {
      super($$0, new ghq($$0.a(gif.dF)), new ghq($$0.a(gif.dG)), 0.5F);
      this.a(new gzd<>(this, $$0.f(), a));
      this.a(new hai<>(this, $$0.e(), "villager"));
      this.a(new gzc<>(this));
   }

   public ale a(hdz $$0) {
      return j;
   }

   protected float b(hdz $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hdz b() {
      return new hdz();
   }

   public void a(cqe $$0, hdz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hce.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gy();
   }
}

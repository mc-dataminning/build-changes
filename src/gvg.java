public class gvg extends gwq<cnj, hbo, gfb<hbo>> {
   private static final ale a = ale.b("textures/entity/enderman/enderman.png");
   private final azt j = azt.a();

   public gvg(gvk.a $$0) {
      super($$0, new gfb<>($$0.a(gif.aN)), 0.5F);
      this.a(new gzh(this));
      this.a(new gyz(this, $$0.d()));
   }

   public fdw a(hbo $$0) {
      fdw $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public ale b(hbo $$0) {
      return a;
   }

   public hbo a() {
      return new hbo();
   }

   public void a(cnj $$0, hbo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwb.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}

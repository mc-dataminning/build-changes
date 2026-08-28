public class gyx extends gxf<cqq, hep, gid> {
   private static final alg a = alg.b("textures/entity/wandering_trader.png");

   public gyx(gvz.a $$0) {
      super($$0, new gid($$0.a(git.dK)), 0.5F);
      this.a(new gzs<>(this, $$0.f()));
      this.a(new gzr<>(this));
   }

   public alg a(hep $$0) {
      return a;
   }

   public hep b() {
      return new hep();
   }

   public void a(cqq $$0, hep $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hcu.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}

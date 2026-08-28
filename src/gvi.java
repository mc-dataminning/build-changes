public class gvi extends gue<cra, hbm> {
   private static final ald a = ald.b("textures/entity/llama/spit.png");
   private final geu g;

   public gvi(guf.a $$0) {
      super($$0);
      this.g = new geu($$0.a(ghc.bE));
   }

   public void a(hbm $$0, fho $$1, gny $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      fhs $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hgi.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hbm a() {
      return new hbm();
   }

   public void a(cra $$0, hbm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}

public class gyv extends gwg<csl, heq> {
   public static final alg a = alg.b("textures/entity/trident.png");
   private final gif g;

   public gyv(gwh.a $$0) {
      super($$0);
      this.g = new gif($$0.a(gjb.dB));
   }

   public void a(heq $$0, fjj $$1, gqa $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fjn $$4 = gxf.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hin.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public heq a() {
      return new heq();
   }

   public void a(csl $$0, heq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}

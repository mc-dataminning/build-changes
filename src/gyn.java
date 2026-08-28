public class gyn extends gvy<csg, hei> {
   public static final alg a = alg.b("textures/entity/trident.png");
   private final ghx g;

   public gyn(gvz.a $$0) {
      super($$0);
      this.g = new ghx($$0.a(git.dz));
   }

   public void a(hei $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fjg $$4 = gwx.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hif.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hei a() {
      return new hei();
   }

   public void a(csg $$0, hei $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}

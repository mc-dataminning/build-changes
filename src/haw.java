public class haw extends gyh<ctg, hgs> {
   public static final ali a = ali.b("textures/entity/trident.png");
   private final gkh g;

   public haw(gyi.a $$0) {
      super($$0);
      this.g = new gkh($$0.a(gld.dD));
   }

   public void a(hgs $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      flr $$4 = gzg.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hkq.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hgs a() {
      return new hgs();
   }

   public void a(ctg $$0, hgs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}

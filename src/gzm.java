public class gzm extends gwx<csv, hfi> {
   public static final alg a = alg.b("textures/entity/trident.png");
   private final giw g;

   public gzm(gwy.a $$0) {
      super($$0);
      this.g = new giw($$0.a(gjs.dD));
   }

   public void a(hfi $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fkh $$4 = gxw.a($$2, this.g.a(a), false, $$0.c);
      this.g.a($$1, $$4, $$3, hjg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfi a() {
      return new hfi();
   }

   public void a(csv $$0, hfi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}

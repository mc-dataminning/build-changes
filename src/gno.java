public class gno extends gmu<cgu, gtx, fxs> {
   private static final alh a = alh.b("textures/entity/dolphin.png");

   public gno(gnz.a $$0) {
      super($$0, new fxs($$0.a(gba.ab)), new fxs($$0.a(gba.ac)), 0.7F);
      this.a(new grt(this, $$0.b()));
   }

   public alh a(gtx $$0) {
      return a;
   }

   public gtx a() {
      return new gtx();
   }

   public void a(cgu $$0, gtx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dA().j() > 1.0E-7;
   }
}

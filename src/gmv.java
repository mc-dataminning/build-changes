public class gmv extends gpf<chs, gth, fwt> {
   private static final alh a = alh.b("textures/entity/allay/allay.png");

   public gmv(gnz.a $$0) {
      super($$0, new fwt($$0.a(gba.a)), 0.4F);
      this.a(new gsf<>(this, $$0.b()));
   }

   public alh a(gth $$0) {
      return a;
   }

   public gth a() {
      return new gth();
   }

   public void a(chs $$0, gth $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
      $$1.b = $$0.gw();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(chs $$0, jg $$1) {
      return 15;
   }
}

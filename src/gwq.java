public class gwq extends gzb<cle, hde, gga> {
   private static final alr a = alr.b("textures/entity/allay/allay.png");

   public gwq(gxv.a $$0) {
      super($$0, new gga($$0.a(gkq.c)), 0.4F);
      this.a(new hcb<>(this));
   }

   public alr a(hde $$0) {
      return a;
   }

   public hde a() {
      return new hde();
   }

   public void a(cle $$0, hde $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdg.a($$0, $$1, this.h);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cle $$0, iw $$1) {
      return 15;
   }
}

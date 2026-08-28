public class gvo extends gxz<ckl, hcb, gex> {
   private static final alg a = alg.b("textures/entity/allay/allay.png");

   public gvo(gwt.a $$0) {
      super($$0, new gex($$0.a(gjn.c)), 0.4F);
      this.a(new haz<>(this));
   }

   public alg a(hcb $$0) {
      return a;
   }

   public hcb a() {
      return new hcb();
   }

   public void a(ckl $$0, hcb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hcd.a($$0, $$1, this.h);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(ckl $$0, iv $$1) {
      return 15;
   }
}

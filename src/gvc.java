public class gvc extends gxn<ckh, hbp, gel> {
   private static final alg a = alg.b("textures/entity/allay/allay.png");

   public gvc(gwh.a $$0) {
      super($$0, new gel($$0.a(gjb.c)), 0.4F);
      this.a(new han<>(this));
   }

   public alg a(hbp $$0) {
      return a;
   }

   public hbp a() {
      return new hbp();
   }

   public void a(ckh $$0, hbp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hbr.a($$0, $$1, this.h);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(ckh $$0, iu $$1) {
      return 15;
   }
}

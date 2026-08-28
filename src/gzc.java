public class gzc extends gxn<cos, hev, gij> {
   private static final alg a = alg.b("textures/entity/illager/vex.png");
   private static final alg j = alg.b("textures/entity/illager/vex_charging.png");

   public gzc(gwh.a $$0) {
      super($$0, new gij($$0.a(gjb.dI)), 0.3F);
      this.a(new han<>(this));
   }

   protected int a(cos $$0, iu $$1) {
      return 15;
   }

   public alg a(hev $$0) {
      return $$0.a ? j : a;
   }

   public hev b() {
      return new hev();
   }

   public void a(cos $$0, hev $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hbr.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}

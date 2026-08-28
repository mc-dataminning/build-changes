public class gmx extends glj<ckp, fxn> {
   private static final akq a = akq.b("textures/entity/illager/vex.png");
   private static final akq i = akq.b("textures/entity/illager/vex_charging.png");

   public gmx(gkd.a $$0) {
      super($$0, new fxn($$0.a(fyd.bP)), 0.3F);
      this.a(new goi<>(this, $$0.d()));
   }

   protected int a(ckp $$0, jd $$1) {
      return 15;
   }

   public akq a(ckp $$0) {
      return $$0.gn() ? i : a;
   }
}

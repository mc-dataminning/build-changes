public class gnb extends gln<ckr, fxr> {
   private static final akr a = akr.b("textures/entity/illager/vex.png");
   private static final akr i = akr.b("textures/entity/illager/vex_charging.png");

   public gnb(gkh.a $$0) {
      super($$0, new fxr($$0.a(fyh.bP)), 0.3F);
      this.a(new gom<>(this, $$0.d()));
   }

   protected int a(ckr $$0, jd $$1) {
      return 15;
   }

   public akr a(ckr $$0) {
      return $$0.gm() ? i : a;
   }
}

public class gmf extends gop<chg, gsq, fwe> {
   private static final alc a = alc.b("textures/entity/allay/allay.png");

   public gmf(gnj.a $$0) {
      super($$0, new fwe($$0.a(gak.a)), 0.4F);
      this.a(new grp<>(this, $$0.b()));
   }

   public alc a(gsq $$0) {
      return a;
   }

   public gsq a() {
      return new gsq();
   }

   public void a(chg $$0, gsq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
      $$1.b = $$0.gq();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(chg $$0, je $$1) {
      return 15;
   }
}

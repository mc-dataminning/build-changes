public class gng extends gpq<chx, gts, fxe> {
   private static final ali a = ali.b("textures/entity/allay/allay.png");

   public gng(gok.a $$0) {
      super($$0, new fxe($$0.a(gbl.a)), 0.4F);
      this.a(new gsq<>(this, $$0.b()));
   }

   public ali a(gts $$0) {
      return a;
   }

   public gts a() {
      return new gts();
   }

   public void a(chx $$0, gts $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gu();
      $$1.b = $$0.gv();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(chx $$0, jh $$1) {
      return 15;
   }
}

public class gva extends gtl<cmn, hau, gem> {
   private static final akv a = akv.b("textures/entity/illager/vex.png");
   private static final akv b = akv.b("textures/entity/illager/vex_charging.png");

   public gva(gsf.a $$0) {
      super($$0, new gem($$0.a(gfd.ds)), 0.3F);
      this.a(new gwm<>(this));
   }

   protected int a(cmn $$0, ji $$1) {
      return 15;
   }

   public akv a(hau $$0) {
      return $$0.a ? b : a;
   }

   public hau b() {
      return new hau();
   }

   public void a(cmn $$0, hau $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxq.a($$0, $$1, this.i);
      $$1.a = $$0.gs();
   }
}

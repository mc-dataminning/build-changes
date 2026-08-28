public class guj extends gsu<cnk, haa, gdu> {
   private static final alz a = alz.b("textures/entity/illager/vex.png");
   private static final alz b = alz.b("textures/entity/illager/vex_charging.png");

   public guj(gro.a $$0) {
      super($$0, new gdu($$0.a(gel.dn)), 0.3F);
      this.a(new gvv<>(this, $$0.b()));
   }

   protected int a(cnk $$0, jh $$1) {
      return 15;
   }

   public alz a(haa $$0) {
      return $$0.a ? b : a;
   }

   public haa b() {
      return new haa();
   }

   public void a(cnk $$0, haa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
   }
}

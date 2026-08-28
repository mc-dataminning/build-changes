public class guk extends gsv<cnk, hab, gdv> {
   private static final alz a = alz.b("textures/entity/illager/vex.png");
   private static final alz b = alz.b("textures/entity/illager/vex_charging.png");

   public guk(grp.a $$0) {
      super($$0, new gdv($$0.a(gem.dn)), 0.3F);
      this.a(new gvw<>(this, $$0.b()));
   }

   protected int a(cnk $$0, jh $$1) {
      return 15;
   }

   public alz a(hab $$0) {
      return $$0.a ? b : a;
   }

   public hab b() {
      return new hab();
   }

   public void a(cnk $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
   }
}

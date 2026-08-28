public class gul extends gsw<cnl, hac, gdw> {
   private static final alz a = alz.b("textures/entity/illager/vex.png");
   private static final alz b = alz.b("textures/entity/illager/vex_charging.png");

   public gul(grq.a $$0) {
      super($$0, new gdw($$0.a(gen.dn)), 0.3F);
      this.a(new gvx<>(this, $$0.b()));
   }

   protected int a(cnl $$0, jh $$1) {
      return 15;
   }

   public alz a(hac $$0) {
      return $$0.a ? b : a;
   }

   public hac b() {
      return new hac();
   }

   public void a(cnl $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
   }
}

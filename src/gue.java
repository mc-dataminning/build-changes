public class gue extends gsp<cng, gzv, gdp> {
   private static final alz a = alz.b("textures/entity/illager/vex.png");
   private static final alz b = alz.b("textures/entity/illager/vex_charging.png");

   public gue(grj.a $$0) {
      super($$0, new gdp($$0.a(geg.dn)), 0.3F);
      this.a(new gvq<>(this, $$0.b()));
   }

   protected int a(cng $$0, jh $$1) {
      return 15;
   }

   public alz a(gzv $$0) {
      return $$0.a ? b : a;
   }

   public gzv b() {
      return new gzv();
   }

   public void a(cng $$0, gzv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
   }
}

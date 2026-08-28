public class guy extends gtj<cml, has, gek> {
   private static final akv a = akv.b("textures/entity/illager/vex.png");
   private static final akv b = akv.b("textures/entity/illager/vex_charging.png");

   public guy(gsd.a $$0) {
      super($$0, new gek($$0.a(gfb.ds)), 0.3F);
      this.a(new gwk<>(this));
   }

   protected int a(cml $$0, ji $$1) {
      return 15;
   }

   public akv a(has $$0) {
      return $$0.a ? b : a;
   }

   public has b() {
      return new has();
   }

   public void a(cml $$0, has $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxo.a($$0, $$1, this.i);
      $$1.a = $$0.gs();
   }
}

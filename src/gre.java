public class gre extends gpq<cmf, gwu, gau> {
   private static final ali a = ali.b("textures/entity/illager/vex.png");
   private static final ali b = ali.b("textures/entity/illager/vex_charging.png");

   public gre(gok.a $$0) {
      super($$0, new gau($$0.a(gbl.cS)), 0.3F);
      this.a(new gsq<>(this, $$0.b()));
   }

   protected int a(cmf $$0, jh $$1) {
      return 15;
   }

   public ali a(gwu $$0) {
      return $$0.a ? b : a;
   }

   public gwu c() {
      return new gwu();
   }

   public void a(cmf $$0, gwu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gu();
   }
}

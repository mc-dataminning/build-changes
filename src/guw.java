public class guw extends gth<cmk, haq, gei> {
   private static final aku a = aku.b("textures/entity/illager/vex.png");
   private static final aku b = aku.b("textures/entity/illager/vex_charging.png");

   public guw(gsb.a $$0) {
      super($$0, new gei($$0.a(gez.ds)), 0.3F);
      this.a(new gwi<>(this));
   }

   protected int a(cmk $$0, ji $$1) {
      return 15;
   }

   public aku a(haq $$0) {
      return $$0.a ? b : a;
   }

   public haq b() {
      return new haq();
   }

   public void a(cmk $$0, haq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxm.a($$0, $$1, this.i);
      $$1.a = $$0.gp();
   }
}

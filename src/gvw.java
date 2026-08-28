public class gvw extends gvb<cjh, hci, gfr> {
   private static final alg a = alg.b("textures/entity/dolphin.png");

   public gvw(gwh.a $$0) {
      super($$0, new gfr($$0.a(gjb.ax)), new gfr($$0.a(gjb.ay)), 0.7F);
      this.a(new hac(this));
   }

   public alg a(hci $$0) {
      return a;
   }

   public hci a() {
      return new hci();
   }

   public void a(cjh $$0, hci $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdc.a($$0, $$1, this.h);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}

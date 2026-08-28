public class gmh extends gln<cgd, gsp, fwt> {
   private static final alb a = alb.b("textures/entity/dolphin.png");

   public gmh(gms.a $$0) {
      super($$0, new fwt($$0.a(gaa.ab)), new fwt($$0.a(gaa.ac)), 0.7F);
      this.a(new gqm(this, $$0.b()));
   }

   public alb a(gsp $$0) {
      return a;
   }

   public gsp a() {
      return new gsp();
   }

   public void a(cgd $$0, gsp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dv().j() > 1.0E-7;
   }
}

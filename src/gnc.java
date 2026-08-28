public class gnc extends gny<ckp, gtf, fxf> {
   private static final alb a = alb.b("textures/entity/ghast/ghast.png");
   private static final alb b = alb.b("textures/entity/ghast/ghast_shooting.png");

   public gnc(gms.a $$0) {
      super($$0, new fxf($$0.a(gaa.aD)), 1.5F);
   }

   public alb a(gtf $$0) {
      return $$0.a ? b : a;
   }

   public gtf c() {
      return new gtf();
   }

   public void a(ckp $$0, gtf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}

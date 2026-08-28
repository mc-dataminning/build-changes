public class gpm extends gny<clj, gvb, fzj> {
   private static final alb a = alb.b("textures/entity/illager/vex.png");
   private static final alb b = alb.b("textures/entity/illager/vex_charging.png");

   public gpm(gms.a $$0) {
      super($$0, new fzj($$0.a(gaa.cR)), 0.3F);
      this.a(new gqy<>(this, $$0.b()));
   }

   protected int a(clj $$0, je $$1) {
      return 15;
   }

   public alb a(gvb $$0) {
      return $$0.a ? b : a;
   }

   public gvb c() {
      return new gvb();
   }

   public void a(clj $$0, gvb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
   }
}

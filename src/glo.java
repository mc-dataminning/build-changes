public class glo extends gny<chb, grz, fvu> {
   private static final alb a = alb.b("textures/entity/allay/allay.png");

   public glo(gms.a $$0) {
      super($$0, new fvu($$0.a(gaa.a)), 0.4F);
      this.a(new gqy<>(this, $$0.b()));
   }

   public alb a(grz $$0) {
      return a;
   }

   public grz a() {
      return new grz();
   }

   public void a(chb $$0, grz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.gp();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(chb $$0, je $$1) {
      return 15;
   }
}

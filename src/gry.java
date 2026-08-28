public class gry extends gqf<cjo, gyc, gbo> {
   private static final alp a = alp.b("textures/entity/goat/goat.png");

   public gry(grl.a $$0) {
      super($$0, new gbo($$0.a(gei.aX)), new gbo($$0.a(gei.aY)), 0.7F);
   }

   public alp a(gyc $$0) {
      return a;
   }

   public gyc b() {
      return new gyc();
   }

   public void a(cjo $$0, gyc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.gp();
      $$1.c = $$0.gB();
   }
}

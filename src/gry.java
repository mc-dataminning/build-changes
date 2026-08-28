public class gry extends guj<ciy, gym, gbq> {
   private static final aku a = aku.b("textures/entity/allay/allay.png");

   public gry(gtd.a $$0) {
      super($$0, new gbq($$0.a(ggb.c)), 0.4F);
      this.a(new gxk<>(this));
   }

   public aku a(gym $$0) {
      return a;
   }

   public gym a() {
      return new gym();
   }

   public void a(ciy $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyo.a($$0, $$1, this.i);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.L($$2);
      $$1.d = $$0.K($$2);
   }

   protected int a(ciy $$0, ji $$1) {
      return 15;
   }
}

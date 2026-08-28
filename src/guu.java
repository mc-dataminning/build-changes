public class guu extends gxf<ckd, hbh, gee> {
   private static final alg a = alg.b("textures/entity/allay/allay.png");

   public guu(gvz.a $$0) {
      super($$0, new gee($$0.a(git.c)), 0.4F);
      this.a(new haf<>(this));
   }

   public alg a(hbh $$0) {
      return a;
   }

   public hbh a() {
      return new hbh();
   }

   public void a(ckd $$0, hbh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hbj.a($$0, $$1, this.h);
      $$1.a = $$0.q();
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(ckd $$0, iu $$1) {
      return 15;
   }
}

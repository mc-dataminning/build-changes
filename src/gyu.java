public class gyu extends gxf<coo, hen, gib> {
   private static final alg a = alg.b("textures/entity/illager/vex.png");
   private static final alg j = alg.b("textures/entity/illager/vex_charging.png");

   public gyu(gvz.a $$0) {
      super($$0, new gib($$0.a(git.dG)), 0.3F);
      this.a(new haf<>(this));
   }

   protected int a(coo $$0, iu $$1) {
      return 15;
   }

   public alg a(hen $$0) {
      return $$0.a ? j : a;
   }

   public hen b() {
      return new hen();
   }

   public void a(coo $$0, hen $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hbj.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}

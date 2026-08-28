public class gqe extends gsp<ciy, gws, fzy> {
   private static final alz a = alz.b("textures/entity/allay/allay.png");

   public gqe(grj.a $$0) {
      super($$0, new fzy($$0.a(geg.c)), 0.4F);
      this.a(new gvq<>(this, $$0.b()));
   }

   public alz a(gws $$0) {
      return a;
   }

   public gws a() {
      return new gws();
   }

   public void a(ciy $$0, gws $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
      $$1.b = $$0.gm();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(ciy $$0, jh $$1) {
      return 15;
   }
}

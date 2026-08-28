public class gql extends gsw<cjd, gwz, gaf> {
   private static final alz a = alz.b("textures/entity/allay/allay.png");

   public gql(grq.a $$0) {
      super($$0, new gaf($$0.a(gen.c)), 0.4F);
      this.a(new gvx<>(this, $$0.b()));
   }

   public alz a(gwz $$0) {
      return a;
   }

   public gwz a() {
      return new gwz();
   }

   public void a(cjd $$0, gwz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
      $$1.b = $$0.go();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cjd $$0, jh $$1) {
      return 15;
   }
}

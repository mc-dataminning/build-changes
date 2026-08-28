public class gwr extends gxn<cnx, hcy, gge> {
   private static final alg a = alg.b("textures/entity/ghast/ghast.png");
   private static final alg j = alg.b("textures/entity/ghast/ghast_shooting.png");

   public gwr(gwh.a $$0) {
      super($$0, new gge($$0.a(gjb.bb)), 1.5F);
   }

   public alg a(hcy $$0) {
      return $$0.a ? j : a;
   }

   public hcy b() {
      return new hcy();
   }

   public void a(cnx $$0, hcy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}

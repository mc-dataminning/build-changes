public class gwj extends gxf<cnt, hcq, gfw> {
   private static final alg a = alg.b("textures/entity/ghast/ghast.png");
   private static final alg j = alg.b("textures/entity/ghast/ghast_shooting.png");

   public gwj(gvz.a $$0) {
      super($$0, new gfw($$0.a(git.aZ)), 1.5F);
   }

   public alg a(hcq $$0) {
      return $$0.a ? j : a;
   }

   public hcq b() {
      return new hcq();
   }

   public void a(cnt $$0, hcq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}

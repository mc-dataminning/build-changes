public class grt extends gsp<cmm, gxz, gbk> {
   private static final alz a = alz.b("textures/entity/ghast/ghast.png");
   private static final alz b = alz.b("textures/entity/ghast/ghast_shooting.png");

   public grt(grj.a $$0) {
      super($$0, new gbk($$0.a(geg.aO)), 1.5F);
   }

   public alz a(gxz $$0) {
      return $$0.a ? b : a;
   }

   public gxz b() {
      return new gxz();
   }

   public void a(cmm $$0, gxz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}

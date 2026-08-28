public class gyf extends gzb<cpe, hen, ght> {
   private static final alr a = alr.b("textures/entity/ghast/ghast.png");
   private static final alr j = alr.b("textures/entity/ghast/ghast_shooting.png");

   public gyf(gxv.a $$0) {
      super($$0, new ght($$0.a(gkq.bb)), 1.5F);
   }

   public alr a(hen $$0) {
      return $$0.a ? j : a;
   }

   public hen b() {
      return new hen();
   }

   public void a(cpe $$0, hen $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}

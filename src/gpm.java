public class gpm extends gpj<cpf, gvq> {
   private static final alj a = alj.b("textures/entity/illager/evoker_fangs.png");
   private final fzk b;

   public gpm(gpk.a $$0) {
      super($$0);
      this.b = new fzk($$0.a(gck.aI));
   }

   public void a(gvq $$0, fer $$1, gjg $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fev $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, gyv.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gvq a() {
      return new gvq();
   }

   public void a(cpf $$0, gvq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}

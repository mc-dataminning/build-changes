public class grl extends gri<cqd, gxq> {
   private static final alz a = alz.b("textures/entity/illager/evoker_fangs.png");
   private final gbg b;

   public grl(grj.a $$0) {
      super($$0);
      this.b = new gbg($$0.a(geg.aJ));
   }

   public void a(gxq $$0, fgl $$1, gle $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fgp $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hav.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxq a() {
      return new gxq();
   }

   public void a(cqd $$0, gxq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}

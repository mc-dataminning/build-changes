public class grr extends gro<cqh, gxw> {
   private static final alz a = alz.b("textures/entity/illager/evoker_fangs.png");
   private final gbm b;

   public grr(grp.a $$0) {
      super($$0);
      this.b = new gbm($$0.a(gem.aJ));
   }

   public void a(gxw $$0, fgr $$1, glk $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fgv $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hbb.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxw a() {
      return new gxw();
   }

   public void a(cqh $$0, gxw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dM();
      $$1.b = $$0.a($$2);
   }
}

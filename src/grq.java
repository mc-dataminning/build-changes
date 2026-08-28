public class grq extends grn<cqh, gxv> {
   private static final alz a = alz.b("textures/entity/illager/evoker_fangs.png");
   private final gbl b;

   public grq(gro.a $$0) {
      super($$0);
      this.b = new gbl($$0.a(gel.aJ));
   }

   public void a(gxv $$0, fgq $$1, glj $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fgu $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hba.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxv a() {
      return new gxv();
   }

   public void a(cqh $$0, gxv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}

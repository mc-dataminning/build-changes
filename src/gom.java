public class gom extends goj<coy, gup> {
   private static final ali a = ali.b("textures/entity/illager/evoker_fangs.png");
   private final fyl b;

   public gom(gok.a $$0) {
      super($$0);
      this.b = new fyl($$0.a(gbl.ay));
   }

   public void a(gup $$0, feb $$1, gih $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fef $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, gxu.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gup a() {
      return new gup();
   }

   public void a(coy $$0, gup $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dN();
      $$1.b = $$0.a($$2);
   }
}

public class gpc extends goz<cpc, gvf> {
   private static final all a = all.b("textures/entity/illager/evoker_fangs.png");
   private final fzb b;

   public gpc(gpa.a $$0) {
      super($$0);
      this.b = new fzb($$0.a(gcb.ay));
   }

   public void a(gvf $$0, fek $$1, gix $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         feo $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, gyk.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gvf a() {
      return new gvf();
   }

   public void a(cpc $$0, gvf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dO();
      $$1.b = $$0.a($$2);
   }
}

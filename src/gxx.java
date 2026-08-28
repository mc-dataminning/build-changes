public class gxx extends gxu<csv, hee> {
   private static final alr a = alr.b("textures/entity/illager/evoker_fangs.png");
   private final ghp g;

   public gxx(gxv.a $$0) {
      super($$0);
      this.g = new ghp($$0.a(gkq.aW));
   }

   public void a(hee $$0, fld $$1, grn $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         flg $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hkg.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hee a() {
      return new hee();
   }

   public void a(csv $$0, hee $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}

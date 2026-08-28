public class grn extends grk<cpz, gxs> {
   private static final alp a = alp.b("textures/entity/illager/evoker_fangs.png");
   private final gbi b;

   public grn(grl.a $$0) {
      super($$0);
      this.b = new gbi($$0.a(gei.aM));
   }

   public void a(gxs $$0, fgl $$1, glg $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fgp $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hax.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxs a() {
      return new gxs();
   }

   public void a(cpz $$0, gxs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dM();
      $$1.b = $$0.a($$2);
   }
}

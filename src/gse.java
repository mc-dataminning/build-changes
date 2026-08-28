public class gse extends gsb<cpi, gyk> {
   private static final aku a = aku.b("textures/entity/illager/evoker_fangs.png");
   private final gcb b;

   public gse(gsc.a $$0) {
      super($$0);
      this.b = new gcb($$0.a(gfb.aM));
   }

   public void a(gyk $$0, ffu $$1, glx $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         ffy $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hea.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gyk a() {
      return new gyk();
   }

   public void a(cpi $$0, gyk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dM();
      $$1.b = $$0.a($$2);
   }
}

public class gsh extends gse<cpj, gyn> {
   private static final akv a = akv.b("textures/entity/illager/evoker_fangs.png");
   private final gcd b;

   public gsh(gsf.a $$0) {
      super($$0);
      this.b = new gcd($$0.a(gfd.aM));
   }

   public void a(gyn $$0, ffv $$1, glz $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         ffz $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hej.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gyn a() {
      return new gyn();
   }

   public void a(cpj $$0, gyn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}

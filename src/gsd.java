public class gsd extends gsa<cpg, gyj> {
   private static final aku a = aku.b("textures/entity/illager/evoker_fangs.png");
   private final gbz b;

   public gsd(gsb.a $$0) {
      super($$0);
      this.b = new gbz($$0.a(gez.aM));
   }

   public void a(gyj $$0, ffs $$1, glv $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         ffw $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hec.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gyj a() {
      return new gyj();
   }

   public void a(cpg $$0, gyj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dM();
      $$1.b = $$0.a($$2);
   }
}

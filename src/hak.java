public class hak extends gyj<csx, hgk> {
   private static final alk a = alk.b("textures/entity/shulker/spark.png");
   private static final gsn g = gsn.j(a);
   private final gjv h;

   public hak(gyk.a $$0) {
      super($$0);
      this.h = new gjv($$0.a(glf.cW));
   }

   protected int a(csx $$0, iw $$1) {
      return 15;
   }

   public void a(hgk $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azq.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azq.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azq.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      flt $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hks.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      flt $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hks.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hgk a() {
      return new hgk();
   }

   public void a(csx $$0, hgk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}

public class hai extends gyh<csv, hgi> {
   private static final ali a = ali.b("textures/entity/shulker/spark.png");
   private static final gsl g = gsl.j(a);
   private final gjt h;

   public hai(gyi.a $$0) {
      super($$0);
      this.h = new gjt($$0.a(gld.cW));
   }

   protected int a(csv $$0, iv $$1) {
      return 15;
   }

   public void a(hgi $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azo.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azo.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azo.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      flr $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hkq.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      flr $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hkq.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hgi a() {
      return new hgi();
   }

   public void a(csv $$0, hgi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}

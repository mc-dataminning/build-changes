public class gtf extends gtc<cqc, gzl> {
   private static final aku a = aku.b("textures/entity/illager/evoker_fangs.png");
   private final gdb b;

   public gtf(gtd.a $$0) {
      super($$0);
      this.b = new gdb($$0.a(ggb.aO));
   }

   public void a(gzl $$0, fgr $$1, gmx $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fgv $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hfh.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gzl a() {
      return new gzl();
   }

   public void a(cqc $$0, gzl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dK();
      $$1.b = $$0.a($$2);
   }
}

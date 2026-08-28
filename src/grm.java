public class grm extends gsw<cmn, gxu, gbk<gxu>> {
   private static final alz a = alz.b("textures/entity/enderman/enderman.png");
   private final bam b = bam.a();

   public grm(grq.a $$0) {
      super($$0, new gbk<>($$0.a(gen.aE)), 0.5F);
      this.a(new gvn(this));
      this.a(new gvf(this, $$0.d()));
   }

   public fby a(gxu $$0) {
      fby $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alz b(gxu $$0) {
      return a;
   }

   public gxu a() {
      return new gxu();
   }

   public void a(cmn $$0, gxu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsh.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.x();
   }
}

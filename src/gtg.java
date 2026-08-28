public class gtg<T extends cnc> extends gtw<T, gzm> {
   private static final aku a = aku.b("textures/entity/illager/evoker.png");

   public gtg(gtd.a $$0) {
      super($$0, new gdo<>($$0.a(ggb.aN)), 0.5F);
      this.a(new gxk<gzm, gdo<gzm>>(this) {
         public void a(fgr $$0, gmx $$1, int $$2, gzm $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public aku a(gzm $$0) {
      return a;
   }

   public gzm b() {
      return new gzm();
   }

   public void a(T $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
   }
}

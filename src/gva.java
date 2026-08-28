public class gva extends gsw<cmm, gzb> {
   private static final akv a = akv.b("textures/entity/illager/vindicator.png");

   public gva(gsd.a $$0) {
      super($$0, new gco<>($$0.a(gfb.dv)), 0.5F);
      this.a(new gwk<gzb, gco<gzb>>(this) {
         public void a(fft $$0, glx $$1, int $$2, gzb $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public akv a(gzb $$0) {
      return a;
   }

   public gzb b() {
      return new gzb();
   }
}

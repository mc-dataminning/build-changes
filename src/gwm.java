public class gwm extends gws<gzk, gcs> {
   private final gcs a;
   private final gcs b;
   private final gwc c;

   public gwm(gua<gzk, gcs> $$0, gey $$1, gwc $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcs($$1.a(gfb.bv));
      this.b = new gcs($$1.a(gfb.bu));
   }

   public void a(fft $$0, glx $$1, int $$2, gzk $$3, float $$4, float $$5) {
      cwo $$6 = $$3.c;
      det $$7 = $$6.a(kv.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwo.j, des.l, $$2);
      }
   }

   private void a(fft $$0, glx $$1, gzk $$2, cwo $$3, aku<der> $$4, int $$5) {
      gcs $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hgx.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}

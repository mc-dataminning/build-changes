public class gwf extends gws<gyz, gcl> {
   private final gcl a;
   private final gcl b;
   private final gwc c;

   public gwf(gua<gyz, gcl> $$0, gey $$1, gwc $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcl($$1.a(gfb.be));
      this.b = new gcl($$1.a(gfb.bg));
   }

   public void a(fft $$0, glx $$1, int $$2, gyz $$3, float $$4, float $$5) {
      cwo $$6 = $$3.i;
      det $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gcl $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgx.d.e, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}

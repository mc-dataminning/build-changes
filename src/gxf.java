public class gxf extends gxs<gzz, gdl> {
   private final gdl a;
   private final gdl b;
   private final gxc c;

   public gxf(gva<gzz, gdl> $$0, gfy $$1, gxc $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gdl($$1.a(ggb.bg));
      this.b = new gdl($$1.a(ggb.bi));
   }

   public void a(fgr $$0, gmx $$1, int $$2, gzz $$3, float $$4, float $$5) {
      cxh $$6 = $$3.i;
      dfm $$7 = $$6.a(kv.E);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gdl $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hhx.d.e, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}

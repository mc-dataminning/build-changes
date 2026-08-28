public class gxm extends gxs<hak, gds> {
   private final gds a;
   private final gds b;
   private final gxc c;

   public gxm(gva<hak, gds> $$0, gfy $$1, gxc $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gds($$1.a(ggb.bx));
      this.b = new gds($$1.a(ggb.bw));
   }

   public void a(fgr $$0, gmx $$1, int $$2, hak $$3, float $$4, float $$5) {
      cxh $$6 = $$3.c;
      dfm $$7 = $$6.a(kv.E);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cxh.k, dfl.l, $$2);
      }
   }

   private void a(fgr $$0, gmx $$1, hak $$2, cxh $$3, akt<dfk> $$4, int $$5) {
      gds $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hhx.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}

public class gxz extends gxs<hav, gef> {
   public static final aku a = aku.b("textures/entity/trident_riptide.png");
   private final gfc b;

   public gxz(gva<hav, gef> $$0, gfy $$1) {
      super($$0);
      this.b = new gfc($$1.a(ggb.cp));
   }

   public void a(fgr $$0, gmx $$1, int $$2, hav $$3, float $$4, float $$5) {
      if ($$3.al) {
         fgv $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hfh.d);
      }
   }
}

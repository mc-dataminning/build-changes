public class gwl extends gwe<gzf, gcq> {
   public static final alz a = alz.b("textures/entity/trident_riptide.png");
   private final gdn b;

   public gwl(gtm<gzf, gcq> $$0, gej $$1) {
      super($$0);
      this.b = new gdn($$1.a(gem.ck));
   }

   public void a(fgr $$0, glk $$1, int $$2, gzf $$3, float $$4, float $$5) {
      if ($$3.ag) {
         fgv $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hbb.d);
      }
   }
}

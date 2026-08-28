public class gxb extends gwu<gzx, gdh> {
   public static final akv a = akv.b("textures/entity/trident_riptide.png");
   private final gee b;

   public gxb(guc<gzx, gdh> $$0, gfa $$1) {
      super($$0);
      this.b = new gee($$1.a(gfd.cn));
   }

   public void a(ffv $$0, glz $$1, int $$2, gzx $$3, float $$4, float $$5) {
      if ($$3.al) {
         ffz $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hej.d);
      }
   }
}

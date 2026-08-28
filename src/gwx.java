public class gwx extends gwq<gzt, gdd> {
   public static final aku a = aku.b("textures/entity/trident_riptide.png");
   private final gea b;

   public gwx(gty<gzt, gdd> $$0, gew $$1) {
      super($$0);
      this.b = new gea($$1.a(gez.cn));
   }

   public void a(ffs $$0, glv $$1, int $$2, gzt $$3, float $$4, float $$5) {
      if ($$3.al) {
         ffw $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hec.d);
      }
   }
}

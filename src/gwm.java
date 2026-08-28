public class gwm extends gwf<gzg, gcr> {
   public static final alz a = alz.b("textures/entity/trident_riptide.png");
   private final gdo b;

   public gwm(gtn<gzg, gcr> $$0, gek $$1) {
      super($$0);
      this.b = new gdo($$1.a(gen.ck));
   }

   public void a(fgs $$0, gll $$1, int $$2, gzg $$3, float $$4, float $$5) {
      if ($$3.ag) {
         fgw $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hbc.d);
      }
   }
}

public class gzn extends han<hdr, ggw> {
   private final gge<hdr> a;
   private final hku b;

   public gzn(gxw<hdr, ggw> $$0, giq $$1, hku $$2) {
      super($$0);
      this.a = new ggu<>($$1.a(git.cr));
      this.b = $$2;
   }

   private boolean a(cyy $$0, hkv.d $$1) {
      dhh $$2 = $$0.a(kj.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hkv $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fjc $$0, gps $$1, int $$2, hdr $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hjq $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hkv.d.c)) {
               $$0.a();
               if (this.a($$3.W, hkv.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fjg $$7 = $$1.getBuffer(gqc.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hif.d);
               $$0.b();
            }
         }
      }
   }
}

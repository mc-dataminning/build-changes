public class gst extends gsx<gvt, fzh> {
   private final gpi a;

   public gst(gqg<gvt, fzh> $$0, gpi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(feb $$0, gih $$1, int $$2, gvt $$3, float $$4, float $$5) {
      haf $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azk.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azk.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cwb $$9 = $$3.aW_();
         this.a.a($$9, cvz.h, false, $$0, $$1, $$2, gxu.d, $$6);
         $$0.b();
      }
   }
}

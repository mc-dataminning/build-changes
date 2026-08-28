public class gww extends gws<hag, gdy> {
   private final gdy a;

   public gww(gua<hag, gdy> $$0, gey $$1) {
      super($$0);
      this.a = new gdy($$1.a(gfb.cP));
   }

   public void a(fft $$0, glx $$1, int $$2, hag $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         ffx $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gmh.s(guh.a));
         } else {
            $$7 = $$1.getBuffer(gmh.j(guh.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gte.a($$3, 0.0F));
      }
   }
}

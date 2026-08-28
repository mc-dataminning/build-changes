public class har extends han<heb, ghp> {
   private final ghp a;

   public har(gxw<heb, ghp> $$0, giq $$1) {
      super($$0);
      this.a = new ghp($$1.a(git.dd));
   }

   public void a(fjc $$0, gps $$1, int $$2, heb $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         fjg $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gqc.s(gyd.a));
         } else {
            $$7 = $$1.getBuffer(gqc.j(gyd.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gxa.a($$3, 0.0F));
      }
   }
}

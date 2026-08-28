public class grj extends grf<guq, fyy> {
   private final fyy a;

   public grj(goo<guq, fyy> $$0, fzx $$1) {
      super($$0);
      this.a = new fyy($$1.a(gaa.cs));
   }

   public void a(fcu $$0, ggv $$1, int $$2, guq $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fcy $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(ghe.s(this.b($$3)));
         } else {
            $$7 = $$1.getBuffer(ghe.j(this.b($$3)));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gnt.a($$3, 0.0F));
      }
   }
}

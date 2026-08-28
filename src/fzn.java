public class fzn {
   private final geb a;
   private final fzf b;
   private final gex c;
   private fzn.a d = fzn.a.a;

   public fzn(geb $$0, fzf $$1, gex $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            jd $$0 = this.a.do();
            boolean $$1 = this.b.d($$0.v());
            if ($$1 || this.c.b($$0) || this.a.R_() || !this.a.bE()) {
               this.d = fzn.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == fzn.a.c;
   }

   public void c() {
      if (this.d == fzn.a.a) {
         this.d = fzn.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}

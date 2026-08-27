public class fzv {
   private final gei a;
   private final fzn b;
   private final gfe c;
   private fzv.a d = fzv.a.a;

   public fzv(gei $$0, fzn $$1, gfe $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            ir $$0 = this.a.du();
            boolean $$1 = this.b.d($$0.v());
            if ($$1 || this.c.a($$0) || this.a.O_() || !this.a.bI()) {
               this.d = fzv.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == fzv.a.c;
   }

   public void c() {
      if (this.d == fzv.a.a) {
         this.d = fzv.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}

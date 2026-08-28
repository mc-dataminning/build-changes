public class gfo {
   private final gkc a;
   private final gff b;
   private final glc c;
   private gfo.a d = gfo.a.a;

   public gfo(gkc $$0, gff $$1, glc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            jh $$0 = this.a.dw();
            boolean $$1 = this.b.e($$0.v());
            if ($$1 || this.c.a($$0) || this.a.aa_() || !this.a.bL()) {
               this.d = gfo.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == gfo.a.c;
   }

   public void c() {
      if (this.d == gfo.a.a) {
         this.d = gfo.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}

public class ggi {
   private final gkw a;
   private final gfz b;
   private final glu c;
   private ggi.a d = ggi.a.a;

   public ggi(gkw $$0, gfz $$1, glu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            ji $$0 = this.a.dv();
            boolean $$1 = this.b.e($$0.v());
            if ($$1 || this.c.a($$0) || this.a.Z_() || !this.a.bL()) {
               this.d = ggi.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == ggi.a.c;
   }

   public void c() {
      if (this.d == ggi.a.a) {
         this.d = ggi.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}

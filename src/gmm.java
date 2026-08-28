public class gmm {
   private final grb a;
   private final gmd b;
   private final grx c;
   private gmm.a d = gmm.a.a;

   public gmm(grb $$0, gmd $$1, grx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            iw $$0 = this.a.dv();
            boolean $$1 = this.b.e($$0.v());
            if ($$1 || this.c.a($$0) || this.a.Z_() || !this.a.bJ()) {
               this.d = gmm.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == gmm.a.c;
   }

   public void c() {
      if (this.d == gmm.a.a) {
         this.d = gmm.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}

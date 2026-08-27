public class gnp implements gnu {
   private static final int a = 6000;
   private static final vs b = vs.c("tutorial.find_tree.title");
   private static final vs c = vs.c("tutorial.find_tree.description");
   private final gnt d;
   private fcv e;
   private int f;

   public gnp(gnt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gnv.f);
      } else {
         if (this.f == 1) {
            fvs $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gnv.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fcv(fcv.a.c, b, c, false);
            this.d.e().ax().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(fra $$0, eot $$1) {
      if ($$1.c() == eot.a.b) {
         dme $$2 = $$0.a_(((eor)$$1).a());
         if ($$2.a(aue.ai)) {
            this.d.a(gnv.c);
         }
      }
   }

   @Override
   public void a(cpq $$0) {
      if ($$0.a(aum.al)) {
         this.d.a(gnv.e);
      }
   }

   private static boolean b(fvs $$0) {
      return $$0.fV().a_($$0x -> $$0x.a(aum.al));
   }

   public static boolean a(fvs $$0) {
      for (il<czf> $$1 : kh.e.c(aue.ai)) {
         czf $$2 = $$1.a();
         if ($$0.j().a(atz.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

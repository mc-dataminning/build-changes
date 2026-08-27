public class gep implements geu {
   private static final int a = 6000;
   private static final tl b = tl.c("tutorial.find_tree.title");
   private static final tl c = tl.c("tutorial.find_tree.description");
   private final get d;
   private euz e;
   private int f;

   public gep(get $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gev.f);
      } else {
         if (this.f == 1) {
            fng $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gev.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new euz(euz.a.c, b, c, false);
            this.d.e().ay().a(this.e);
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
   public void a(fix $$0, ehl $$1) {
      if ($$1.c() == ehl.a.b) {
         dfj $$2 = $$0.a_(((ehj)$$1).a());
         if ($$2.a(apt.ai)) {
            this.d.a(gev.c);
         }
      }
   }

   @Override
   public void a(cjf $$0) {
      if ($$0.a(aqb.al)) {
         this.d.a(gev.e);
      }
   }

   private static boolean b(fng $$0) {
      return $$0.fR().a_($$0x -> $$0x.a(aqb.al));
   }

   public static boolean a(fng $$0) {
      for (hg<csv> $$1 : jd.f.c(apt.ai)) {
         csv $$2 = $$1.a();
         if ($$0.j().a(apo.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

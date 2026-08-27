public class ger implements gew {
   private static final int a = 6000;
   private static final tn b = tn.c("tutorial.find_tree.title");
   private static final tn c = tn.c("tutorial.find_tree.description");
   private final gev d;
   private evb e;
   private int f;

   public ger(gev $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gex.f);
      } else {
         if (this.f == 1) {
            fni $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gex.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new evb(evb.a.c, b, c, false);
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
   public void a(fiz $$0, ehn $$1) {
      if ($$1.c() == ehn.a.b) {
         dfl $$2 = $$0.a_(((ehl)$$1).a());
         if ($$2.a(apu.ai)) {
            this.d.a(gex.c);
         }
      }
   }

   @Override
   public void a(cjh $$0) {
      if ($$0.a(aqc.al)) {
         this.d.a(gex.e);
      }
   }

   private static boolean b(fni $$0) {
      return $$0.fR().a_($$0x -> $$0x.a(aqc.al));
   }

   public static boolean a(fni $$0) {
      for (hg<csx> $$1 : jd.f.c(apu.ai)) {
         csx $$2 = $$1.a();
         if ($$0.j().a(app.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

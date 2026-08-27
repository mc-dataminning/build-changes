public class geo implements geu {
   private static final int a = 1200;
   private static final tl b = tl.c("tutorial.craft_planks.title");
   private static final tl c = tl.c("tutorial.craft_planks.description");
   private final get d;
   private euz e;
   private int f;

   public geo(get $$0) {
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
            if ($$0 != null) {
               if ($$0.fR().a(aqa.b)) {
                  this.d.a(gev.f);
                  return;
               }

               if (a($$0, aqa.b)) {
                  this.d.a(gev.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new euz(euz.a.e, b, c, false);
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
   public void a(cjf $$0) {
      if ($$0.a(aqa.b)) {
         this.d.a(gev.f);
      }
   }

   public static boolean a(fng $$0, aqh<cja> $$1) {
      for (he<cja> $$2 : jb.i.c($$1)) {
         if ($$0.j().a(apn.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}

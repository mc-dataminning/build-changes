public class gus implements gux {
   private static final int a = 6000;
   private static final xo b = xo.c("tutorial.find_tree.title");
   private static final xo c = xo.c("tutorial.find_tree.description");
   private final guw d;
   private fjn e;
   private int f;

   public gus(guw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guy.f);
      } else {
         if (this.f == 1) {
            gco $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(guy.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fjn(fjn.a.c, b, c, false);
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
   public void a(fxt $$0, evn $$1) {
      if ($$1.c() == evn.a.b) {
         dsa $$2 = $$0.a_(((evl)$$1).a());
         if ($$2.a(awo.aj)) {
            this.d.a(guy.c);
         }
      }
   }

   @Override
   public void a(cun $$0) {
      if ($$0.a(awx.aM)) {
         this.d.a(guy.e);
      }
   }

   private static boolean b(gco $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(awx.aM));
   }

   public static boolean a(gco $$0) {
      for (ji<dex> $$1 : lp.e.c(awo.aj)) {
         dex $$2 = $$1.a();
         if ($$0.j().a(awj.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

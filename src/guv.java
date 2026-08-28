public class guv implements gva {
   private static final int a = 6000;
   private static final xp b = xp.c("tutorial.find_tree.title");
   private static final xp c = xp.c("tutorial.find_tree.description");
   private final guz d;
   private fjq e;
   private int f;

   public guv(guz $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvb.f);
      } else {
         if (this.f == 1) {
            gcr $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gvb.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fjq(fjq.a.c, b, c, false);
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
   public void a(fxw $$0, evq $$1) {
      if ($$1.c() == evq.a.b) {
         dsd $$2 = $$0.a_(((evo)$$1).a());
         if ($$2.a(awp.aj)) {
            this.d.a(gvb.c);
         }
      }
   }

   @Override
   public void a(cuq $$0) {
      if ($$0.a(awy.aM)) {
         this.d.a(gvb.e);
      }
   }

   private static boolean b(gcr $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(awy.aM));
   }

   public static boolean a(gcr $$0) {
      for (ji<dfa> $$1 : lp.e.c(awp.aj)) {
         dfa $$2 = $$1.a();
         if ($$0.j().a(awk.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

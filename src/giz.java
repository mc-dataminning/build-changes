public class giz implements gje {
   private static final int a = 6000;
   private static final vb b = vb.c("tutorial.find_tree.title");
   private static final vb c = vb.c("tutorial.find_tree.description");
   private final gjd d;
   private eyr e;
   private int f;

   public giz(gjd $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gjf.f);
      } else {
         if (this.f == 1) {
            frk $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gjf.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new eyr(eyr.a.c, b, c, false);
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
   public void a(fmt $$0, ekz $$1) {
      if ($$1.c() == ekz.a.b) {
         dip $$2 = $$0.a_(((ekx)$$1).a());
         if ($$2.a(arr.ai)) {
            this.d.a(gjf.c);
         }
      }
   }

   @Override
   public void a(cmh $$0) {
      if ($$0.a(arz.al)) {
         this.d.a(gjf.e);
      }
   }

   private static boolean b(frk $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(arz.al));
   }

   public static boolean a(frk $$0) {
      for (ie<cvz> $$1 : kb.e.c(arr.ai)) {
         cvz $$2 = $$1.a();
         if ($$0.j().a(arm.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

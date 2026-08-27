public class gdw implements geb {
   private static final int a = 6000;
   private static final tf b = tf.c("tutorial.find_tree.title");
   private static final tf c = tf.c("tutorial.find_tree.description");
   private final gea d;
   private eup e;
   private int f;

   public gdw(gea $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gec.f);
      } else {
         if (this.f == 1) {
            fmn $$0 = this.d.e().v;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gec.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new eup(eup.a.c, b, c, false);
            this.d.e().az().a(this.e);
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
   public void a(fii $$0, ehc $$1) {
      if ($$1.c() == ehc.a.b) {
         dfa $$2 = $$0.a_(((eha)$$1).a());
         if ($$2.a(apl.ai)) {
            this.d.a(gec.c);
         }
      }
   }

   @Override
   public void a(ciy $$0) {
      if ($$0.a(apt.al)) {
         this.d.a(gec.e);
      }
   }

   private static boolean b(fmn $$0) {
      return $$0.fQ().a_($$0x -> $$0x.a(apt.al));
   }

   public static boolean a(fmn $$0) {
      for (he<csm> $$1 : jb.f.c(apl.ai)) {
         csm $$2 = $$1.a();
         if ($$0.j().a(apg.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

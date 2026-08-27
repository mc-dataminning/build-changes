public class gef implements gek {
   private static final int a = 6000;
   private static final tf b = tf.c("tutorial.find_tree.title");
   private static final tf c = tf.c("tutorial.find_tree.description");
   private final gej d;
   private eup e;
   private int f;

   public gef(gej $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gel.f);
      } else {
         if (this.f == 1) {
            fmw $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gel.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new eup(eup.a.c, b, c, false);
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
   public void a(fin $$0, ehb $$1) {
      if ($$1.c() == ehb.a.b) {
         dez $$2 = $$0.a_(((egz)$$1).a());
         if ($$2.a(apl.ai)) {
            this.d.a(gel.c);
         }
      }
   }

   @Override
   public void a(cix $$0) {
      if ($$0.a(apt.al)) {
         this.d.a(gel.e);
      }
   }

   private static boolean b(fmw $$0) {
      return $$0.fQ().a_($$0x -> $$0x.a(apt.al));
   }

   public static boolean a(fmw $$0) {
      for (he<csl> $$1 : jb.f.c(apl.ai)) {
         csl $$2 = $$1.a();
         if ($$0.j().a(apg.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}

public class gee implements gek {
   private static final int a = 1200;
   private static final tf b = tf.c("tutorial.craft_planks.title");
   private static final tf c = tf.c("tutorial.craft_planks.description");
   private final gej d;
   private eup e;
   private int f;

   public gee(gej $$0) {
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
            if ($$0 != null) {
               if ($$0.fQ().a(apt.b)) {
                  this.d.a(gel.f);
                  return;
               }

               if (a($$0, apt.b)) {
                  this.d.a(gel.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new eup(eup.a.e, b, c, false);
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
   public void a(cix $$0) {
      if ($$0.a(apt.b)) {
         this.d.a(gel.f);
      }
   }

   public static boolean a(fmw $$0, aqa<cis> $$1) {
      for (he<cis> $$2 : jb.i.c($$1)) {
         if ($$0.j().a(apg.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}

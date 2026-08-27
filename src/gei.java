public class gei implements gek {
   private static final int a = 600;
   private static final tf b = tf.c("tutorial.punch_tree.title");
   private static final tf c = tf.a("tutorial.punch_tree.description", gej.a("attack"));
   private final gej d;
   private eup e;
   private int f;
   private int g;

   public gei(gej $$0) {
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
               if ($$0.fQ().a(apt.r)) {
                  this.d.a(gel.e);
                  return;
               }

               if (gef.a($$0)) {
                  this.d.a(gel.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new eup(eup.a.c, b, c, true);
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
   public void a(fin $$0, gu $$1, dez $$2, float $$3) {
      boolean $$4 = $$2.a(apl.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gel.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cix $$0) {
      if ($$0.a(apt.r)) {
         this.d.a(gel.e);
      }
   }
}

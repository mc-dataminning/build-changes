public class gdz implements geb {
   private static final int a = 600;
   private static final tf b = tf.c("tutorial.punch_tree.title");
   private static final tf c = tf.a("tutorial.punch_tree.description", gea.a("attack"));
   private final gea d;
   private eup e;
   private int f;
   private int g;

   public gdz(gea $$0) {
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
            if ($$0 != null) {
               if ($$0.fQ().a(apt.r)) {
                  this.d.a(gec.e);
                  return;
               }

               if (gdw.a($$0)) {
                  this.d.a(gec.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new eup(eup.a.c, b, c, true);
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
   public void a(fii $$0, gu $$1, dfa $$2, float $$3) {
      boolean $$4 = $$2.a(apl.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gec.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(ciy $$0) {
      if ($$0.a(apt.r)) {
         this.d.a(gec.e);
      }
   }
}

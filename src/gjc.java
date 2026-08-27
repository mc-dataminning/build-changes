public class gjc implements gje {
   private static final int a = 600;
   private static final vb b = vb.c("tutorial.punch_tree.title");
   private static final vb c = vb.a("tutorial.punch_tree.description", gjd.a("attack"));
   private final gjd d;
   private eyr e;
   private int f;
   private int g;

   public gjc(gjd $$0) {
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
            if ($$0 != null) {
               if ($$0.fS().a(arz.r)) {
                  this.d.a(gjf.e);
                  return;
               }

               if (giz.a($$0)) {
                  this.d.a(gjf.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new eyr(eyr.a.c, b, c, true);
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
   public void a(fmt $$0, hv $$1, dip $$2, float $$3) {
      boolean $$4 = $$2.a(arr.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gjf.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cmh $$0) {
      if ($$0.a(arz.r)) {
         this.d.a(gjf.e);
      }
   }
}

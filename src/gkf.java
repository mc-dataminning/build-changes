public class gkf implements gkh {
   private static final int a = 600;
   private static final vf b = vf.c("tutorial.punch_tree.title");
   private static final vf c = vf.a("tutorial.punch_tree.description", gkg.a("attack"));
   private final gkg d;
   private ezp e;
   private int f;
   private int g;

   public gkf(gkg $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gki.f);
      } else {
         if (this.f == 1) {
            fsi $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(aso.r)) {
                  this.d.a(gki.e);
                  return;
               }

               if (gkc.a($$0)) {
                  this.d.a(gki.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new ezp(ezp.a.c, b, c, true);
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
   public void a(fnr $$0, hx $$1, djg $$2, float $$3) {
      boolean $$4 = $$2.a(asg.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gki.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cmx $$0) {
      if ($$0.a(aso.r)) {
         this.d.a(gki.e);
      }
   }
}

public class gfo implements gfq {
   private static final int a = 600;
   private static final ui b = ui.c("tutorial.punch_tree.title");
   private static final ui c = ui.a("tutorial.punch_tree.description", gfp.a("attack"));
   private final gfp d;
   private evt e;
   private int f;
   private int g;

   public gfo(gfp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gfr.f);
      } else {
         if (this.f == 1) {
            foc $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(ara.r)) {
                  this.d.a(gfr.e);
                  return;
               }

               if (gfl.a($$0)) {
                  this.d.a(gfr.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new evt(evt.a.c, b, c, true);
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
   public void a(fjr $$0, ht $$1, dgb $$2, float $$3) {
      boolean $$4 = $$2.a(aqs.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gfr.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(ckj $$0) {
      if ($$0.a(ara.r)) {
         this.d.a(gfr.e);
      }
   }
}

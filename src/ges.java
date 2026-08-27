public class ges implements geu {
   private static final int a = 600;
   private static final tm b = tm.c("tutorial.punch_tree.title");
   private static final tm c = tm.a("tutorial.punch_tree.description", get.a("attack"));
   private final get d;
   private euz e;
   private int f;
   private int g;

   public ges(get $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gev.f);
      } else {
         if (this.f == 1) {
            fng $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fR().a(aqb.r)) {
                  this.d.a(gev.e);
                  return;
               }

               if (gep.a($$0)) {
                  this.d.a(gev.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new euz(euz.a.c, b, c, true);
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
   public void a(fix $$0, gw $$1, dfj $$2, float $$3) {
      boolean $$4 = $$2.a(apt.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gev.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cjf $$0) {
      if ($$0.a(aqb.r)) {
         this.d.a(gev.e);
      }
   }
}

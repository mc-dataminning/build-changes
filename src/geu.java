public class geu implements gew {
   private static final int a = 600;
   private static final tn b = tn.c("tutorial.punch_tree.title");
   private static final tn c = tn.a("tutorial.punch_tree.description", gev.a("attack"));
   private final gev d;
   private evb e;
   private int f;
   private int g;

   public geu(gev $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gex.f);
      } else {
         if (this.f == 1) {
            fni $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fR().a(aqc.r)) {
                  this.d.a(gex.e);
                  return;
               }

               if (ger.a($$0)) {
                  this.d.a(gex.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new evb(evb.a.c, b, c, true);
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
   public void a(fiz $$0, gw $$1, dfl $$2, float $$3) {
      boolean $$4 = $$2.a(apu.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gex.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cjh $$0) {
      if ($$0.a(aqc.r)) {
         this.d.a(gex.e);
      }
   }
}

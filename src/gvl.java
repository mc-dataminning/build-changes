public class gvl implements gvn {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.punch_tree.title");
   private static final wu c = wu.a("tutorial.punch_tree.description", gvm.a("attack"));
   private final gvm d;
   private fkf e;
   private int f;
   private int g;

   public gvl(gvm $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvo.f);
      } else {
         if (this.f == 1) {
            gdh $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.ga().a(awf.r)) {
                  this.d.a(gvo.e);
                  return;
               }

               if (gvi.a($$0)) {
                  this.d.a(gvo.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fkf(fkf.a.c, b, c, true);
            this.d.e().aw().a(this.e);
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
   public void a(fyl $$0, ja $$1, dsl $$2, float $$3) {
      boolean $$4 = $$2.a(avw.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gvo.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cud $$0) {
      if ($$0.a(awf.r)) {
         this.d.a(gvo.e);
      }
   }
}

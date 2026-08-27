public class gkg implements gki {
   private static final int a = 600;
   private static final vf b = vf.c("tutorial.punch_tree.title");
   private static final vf c = vf.a("tutorial.punch_tree.description", gkh.a("attack"));
   private final gkh d;
   private ezq e;
   private int f;
   private int g;

   public gkg(gkh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkj.f);
      } else {
         if (this.f == 1) {
            fsj $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(asp.r)) {
                  this.d.a(gkj.e);
                  return;
               }

               if (gkd.a($$0)) {
                  this.d.a(gkj.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new ezq(ezq.a.c, b, c, true);
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
   public void a(fns $$0, hx $$1, djh $$2, float $$3) {
      boolean $$4 = $$2.a(ash.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gkj.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cmy $$0) {
      if ($$0.a(asp.r)) {
         this.d.a(gkj.e);
      }
   }
}

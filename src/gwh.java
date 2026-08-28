public class gwh implements gwj {
   private static final int a = 600;
   private static final wz b = wz.c("tutorial.punch_tree.title");
   private static final wz c = wz.a("tutorial.punch_tree.description", gwi.a("attack"));
   private final gwi d;
   private fkx e;
   private int f;
   private int g;

   public gwh(gwi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwk.f);
      } else {
         if (this.f == 1) {
            geb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fY().a(awn.r)) {
                  this.d.a(gwk.e);
                  return;
               }

               if (gwe.a($$0)) {
                  this.d.a(gwk.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fkx(fkx.a.c, b, c, true);
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
   public void a(fzf $$0, jd $$1, dtc $$2, float $$3) {
      boolean $$4 = $$2.a(awe.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gwk.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cuq $$0) {
      if ($$0.a(awn.r)) {
         this.d.a(gwk.e);
      }
   }
}

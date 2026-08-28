public class gwf implements gwh {
   private static final int a = 600;
   private static final wz b = wz.c("tutorial.punch_tree.title");
   private static final wz c = wz.a("tutorial.punch_tree.description", gwg.a("attack"));
   private final gwg d;
   private fkv e;
   private int f;
   private int g;

   public gwf(gwg $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwi.f);
      } else {
         if (this.f == 1) {
            gdz $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(awn.r)) {
                  this.d.a(gwi.e);
                  return;
               }

               if (gwc.a($$0)) {
                  this.d.a(gwi.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fkv(fkv.a.c, b, c, true);
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
   public void a(fzd $$0, jd $$1, dtc $$2, float $$3) {
      boolean $$4 = $$2.a(awe.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gwi.d);
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
         this.d.a(gwi.e);
      }
   }
}

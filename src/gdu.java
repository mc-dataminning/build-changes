public class gdu implements gdw {
   private static final int a = 600;
   private static final te b = te.c("tutorial.punch_tree.title");
   private static final te c = te.a("tutorial.punch_tree.description", gdv.a("attack"));
   private final gdv d;
   private eul e;
   private int f;
   private int g;

   public gdu(gdv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gdx.f);
      } else {
         if (this.f == 1) {
            fmi $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.fQ().a(apr.r)) {
                  this.d.a(gdx.e);
                  return;
               }

               if (gdr.a($$0)) {
                  this.d.a(gdx.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new eul(eul.a.c, b, c, true);
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
   public void a(fie $$0, gv $$1, dey $$2, float $$3) {
      boolean $$4 = $$2.a(apj.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gdx.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(ciw $$0) {
      if ($$0.a(apr.r)) {
         this.d.a(gdx.e);
      }
   }
}

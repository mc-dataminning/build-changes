public class gjt implements gjv {
   private static final int a = 600;
   private static final vd b = vd.c("tutorial.punch_tree.title");
   private static final vd c = vd.a("tutorial.punch_tree.description", gju.a("attack"));
   private final gju d;
   private ezi e;
   private int f;
   private int g;

   public gjt(gju $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gjw.f);
      } else {
         if (this.f == 1) {
            fsb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(asj.r)) {
                  this.d.a(gjw.e);
                  return;
               }

               if (gjq.a($$0)) {
                  this.d.a(gjw.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new ezi(ezi.a.c, b, c, true);
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
   public void a(fnk $$0, hx $$1, dja $$2, float $$3) {
      boolean $$4 = $$2.a(asb.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gjw.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cmr $$0) {
      if ($$0.a(asj.r)) {
         this.d.a(gjw.e);
      }
   }
}

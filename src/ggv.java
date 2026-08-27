public class ggv implements ggx {
   private static final int a = 600;
   private static final ur b = ur.c("tutorial.punch_tree.title");
   private static final ur c = ur.a("tutorial.punch_tree.description", ggw.a("attack"));
   private final ggw d;
   private eww e;
   private int f;
   private int g;

   public ggv(ggw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ggy.f);
      } else {
         if (this.f == 1) {
            fpj $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(ark.r)) {
                  this.d.a(ggy.e);
                  return;
               }

               if (ggs.a($$0)) {
                  this.d.a(ggy.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new eww(eww.a.c, b, c, true);
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
   public void a(fkw $$0, ht $$1, dgw $$2, float $$3) {
      boolean $$4 = $$2.a(arc.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(ggy.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(clb $$0) {
      if ($$0.a(ark.r)) {
         this.d.a(ggy.e);
      }
   }
}

public class ghn implements ghp {
   private static final int a = 600;
   private static final uv b = uv.c("tutorial.punch_tree.title");
   private static final uv c = uv.a("tutorial.punch_tree.description", gho.a("attack"));
   private final gho d;
   private exo e;
   private int f;
   private int g;

   public ghn(gho $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ghq.f);
      } else {
         if (this.f == 1) {
            fqb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fT().a(ars.r)) {
                  this.d.a(ghq.e);
                  return;
               }

               if (ghk.a($$0)) {
                  this.d.a(ghq.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new exo(exo.a.c, b, c, true);
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
   public void a(flo $$0, hx $$1, dhn $$2, float $$3) {
      boolean $$4 = $$2.a(ark.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(ghq.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(clo $$0) {
      if ($$0.a(ars.r)) {
         this.d.a(ghq.e);
      }
   }
}

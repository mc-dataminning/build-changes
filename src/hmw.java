import javax.annotation.Nullable;

public class hmw implements hmy {
   private static final int a = 600;
   private static final wv b = wv.c("tutorial.punch_tree.title");
   private static final wv c = wv.a("tutorial.punch_tree.description", hmx.a("attack"));
   private final hmx d;
   @Nullable
   private fsz e;
   private int f;
   private int g;

   public hmw(hmx $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hmz.f);
      } else {
         fnd $$0 = this.d.e();
         if (this.f == 1) {
            gmw $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axi.r)) {
                  this.d.a(hmz.e);
                  return;
               }

               if (hmt.a($$1)) {
                  this.d.a(hmz.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fsz($$0.h, fsz.a.c, b, c, true);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }
   }

   @Override
   public void a(ghz $$0, jj $$1, dym $$2, float $$3) {
      boolean $$4 = $$2.a(awz.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hmz.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cxy $$0) {
      if ($$0.a(axi.r)) {
         this.d.a(hmz.e);
      }
   }
}

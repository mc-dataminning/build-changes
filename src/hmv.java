import javax.annotation.Nullable;

public class hmv implements hmy {
   private static final int a = 600;
   private static final wv b = wv.c("tutorial.open_inventory.title");
   private static final wv c = wv.a("tutorial.open_inventory.description", hmx.a("inventory"));
   private final hmx d;
   @Nullable
   private fsz e;
   private int f;

   public hmv(hmx $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hmz.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fnd $$0 = this.d.e();
            this.e = new fsz($$0.h, fsz.a.d, b, c, false);
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
   public void c() {
      this.d.a(hmz.e);
   }
}

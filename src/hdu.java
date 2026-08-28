import javax.annotation.Nullable;

public class hdu implements hdx {
   private static final int a = 600;
   private static final xh b = xh.c("tutorial.open_inventory.title");
   private static final xh c = xh.a("tutorial.open_inventory.description", hdw.a("inventory"));
   private final hdw d;
   @Nullable
   private fnl e;
   private int f;

   public hdu(hdw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdy.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fnl(fnl.a.d, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void c() {
      this.d.a(hdy.e);
   }
}

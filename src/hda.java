import javax.annotation.Nullable;

public class hda implements hdd {
   private static final int a = 600;
   private static final xd b = xd.c("tutorial.open_inventory.title");
   private static final xd c = xd.a("tutorial.open_inventory.description", hdc.a("inventory"));
   private final hdc d;
   @Nullable
   private fmw e;
   private int f;

   public hda(hdc $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hde.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fmw(fmw.a.d, b, c, false);
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
      this.d.a(hde.e);
   }
}

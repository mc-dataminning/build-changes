import javax.annotation.Nullable;

public class fxy extends fyb implements azu {
   @Nullable
   private wy a;
   @Nullable
   private wy b;
   private int c;
   private boolean d;
   private final boolean s;

   public fxy(boolean $$0) {
      super(fop.a);
      this.s = $$0;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aN_() {
      return false;
   }

   @Override
   public void a(wy $$0) {
      this.b($$0);
   }

   @Override
   public void b(wy $$0) {
      this.a = $$0;
      this.c(wy.c("menu.working"));
   }

   @Override
   public void c(wy $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.d = true;
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      if (this.d) {
         if (this.s) {
            this.m.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.p, this.a, this.n / 2, 70, 16777215);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.p, wy.i().b(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}

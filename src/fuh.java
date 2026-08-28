import javax.annotation.Nullable;

public class fuh extends fuk implements azg {
   @Nullable
   private wp a;
   @Nullable
   private wp b;
   private int c;
   private boolean d;
   private final boolean s;

   public fuh(boolean $$0) {
      super(fkz.a);
      this.s = $$0;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected boolean aQ_() {
      return false;
   }

   @Override
   public void a(wp $$0) {
      this.b($$0);
   }

   @Override
   public void b(wp $$0) {
      this.a = $$0;
      this.c(wp.c("menu.working"));
   }

   @Override
   public void c(wp $$0) {
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
   public void a(fod $$0, int $$1, int $$2, float $$3) {
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
            $$0.a(this.p, wp.i().b(this.b).f(" " + this.c + "%"), this.n / 2, 90, 16777215);
         }
      }
   }
}

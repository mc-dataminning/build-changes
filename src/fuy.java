import java.util.List;

public class fuy extends fmn {
   private static final fmu c = new fmu(ali.b("recipe_book/tab"), ali.b("recipe_book/tab_selected"));
   private final fjp d;
   private static final float e = 15.0F;
   private float f;

   public fuy(fjp $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(fit $$0, boolean $$1) {
      fva.a $$2 = $$1 ? fva.a.b : fva.a.a;

      for (fva $$4 : $$0.a(this.d)) {
         for (dar<?> $$5 : $$4.a($$2)) {
            if ($$0.d($$5)) {
               this.f = 15.0F;
               return;
            }
         }
      }
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         }

         ali $$5 = this.a.a(true, this.b);
         int $$6 = this.D();
         if (this.b) {
            $$6 -= 2;
         }

         $$0.a(gir::B, $$5, $$6, this.E(), this.g, this.h);
         this.a($$0);
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fku $$0) {
      List<cwb> $$1 = this.d.a();
      int $$2 = this.b ? -2 : 0;
      if ($$1.size() == 1) {
         $$0.b($$1.get(0), this.D() + 9 + $$2, this.E() + 5);
      } else if ($$1.size() == 2) {
         $$0.b($$1.get(0), this.D() + 3 + $$2, this.E() + 5);
         $$0.b($$1.get(1), this.D() + 14 + $$2, this.E() + 5);
      }
   }

   public fjp b() {
      return this.d;
   }

   public boolean a(fit $$0) {
      List<fva> $$1 = $$0.a(this.d);
      this.k = false;

      for (fva $$2 : $$1) {
         if ($$2.b() && $$2.d()) {
            this.k = true;
            break;
         }
      }

      return this.k;
   }
}

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class fxm {
   private final Reference2ObjectMap<cuu, fxm.a> a = new Reference2ObjectArrayMap();
   private final fxv b;

   public fxm(fxv $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cuu $$0, ddi.f $$1, ddi $$2, boolean $$3) {
      List<cxk> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new fxm.a($$4, $$3));
      }
   }

   protected void a(cuu $$0, ddi.f $$1, ddi $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cuu $$0, ddi.f $$1, ddi $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(fnl $$0, flz $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cxk $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(glo.K(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(fnl $$0, flz $$1, int $$2, int $$3, @Nullable cuu $$4) {
      if ($$4 != null) {
         fxm.a $$5 = (fxm.a)this.a.get($$4);
         if ($$5 != null) {
            cxk $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, ftr.a($$1, $$6), $$2, $$3, $$6.a(ku.G));
         }
      }
   }

   static record a(List<cxk> a, boolean b) {

      public cxk a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cxk.k : this.a.get($$0 % $$1);
      }
   }
}

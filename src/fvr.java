import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class fvr {
   private final Reference2ObjectMap<ctw, fvr.a> a = new Reference2ObjectArrayMap();
   private final fwa b;

   public fvr(fwa $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   public void a(cwm $$0, ctw $$1) {
      this.a.put($$1, new fvr.a(List.of($$0), true));
   }

   public void a(List<cwm> $$0, ctw $$1) {
      this.a.put($$1, new fvr.a($$0, false));
   }

   public void a(flq $$0, fke $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cwm $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gjq.J(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(flq $$0, fke $$1, int $$2, int $$3, @Nullable ctw $$4) {
      if ($$4 != null) {
         fvr.a $$5 = (fvr.a)this.a.get($$4);
         if ($$5 != null) {
            cwm $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, frw.a($$1, $$6), $$2, $$3, $$6.a(ku.G));
         }
      }
   }

   static record a(List<cwm> a, boolean b) {

      public cwm a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cwm.k : this.a.get($$0 % $$1);
      }
   }
}

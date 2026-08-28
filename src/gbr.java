import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class gbr {
   private final Reference2ObjectMap<cwn, gbr.a> a = new Reference2ObjectArrayMap();
   private final gca b;

   public gbr(gca $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cwn $$0, baz $$1, dfb $$2, boolean $$3) {
      List<cyy> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new gbr.a($$4, $$3));
      }
   }

   protected void a(cwn $$0, baz $$1, dfb $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cwn $$0, baz $$1, dfb $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(fro $$0, fos $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cyy $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gqc.O(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(fro $$0, fos $$1, int $$2, int $$3, @Nullable cwn $$4) {
      if ($$4 != null) {
         gbr.a $$5 = (gbr.a)this.a.get($$4);
         if ($$5 != null) {
            cyy $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fxu.a($$1, $$6), $$2, $$3, $$6.a(kj.G));
         }
      }
   }

   static record a(List<cyy> a, boolean b) {

      public cyy a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cyy.k : this.a.get($$0 % $$1);
      }
   }
}

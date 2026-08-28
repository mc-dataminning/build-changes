import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class fyh {
   private final Reference2ObjectMap<cua, fyh.a> a = new Reference2ObjectArrayMap();
   private final fyq b;

   public fyh(fyq $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cua $$0, bak $$1, dcq $$2, boolean $$3) {
      List<cwq> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new fyh.a($$4, $$3));
      }
   }

   protected void a(cua $$0, bak $$1, dcq $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cua $$0, bak $$1, dcq $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(fof $$0, flk $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cwq $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gmj.O(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(fof $$0, flk $$1, int $$2, int $$3, @Nullable cua $$4) {
      if ($$4 != null) {
         fyh.a $$5 = (fyh.a)this.a.get($$4);
         if ($$5 != null) {
            cwq $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fum.a($$1, $$6), $$2, $$3, $$6.a(kv.G));
         }
      }
   }

   static record a(List<cwq> a, boolean b) {

      public cwq a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cwq.j : this.a.get($$0 % $$1);
      }
   }
}

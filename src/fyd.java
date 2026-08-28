import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class fyd {
   private final Reference2ObjectMap<ctx, fyd.a> a = new Reference2ObjectArrayMap();
   private final fym b;

   public fyd(fym $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(ctx $$0, baj $$1, dcn $$2, boolean $$3) {
      List<cwn> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new fyd.a($$4, $$3));
      }
   }

   protected void a(ctx $$0, baj $$1, dcn $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(ctx $$0, baj $$1, dcn $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(fob $$0, flh $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cwn $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gmf.O(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(fob $$0, flh $$1, int $$2, int $$3, @Nullable ctx $$4) {
      if ($$4 != null) {
         fyd.a $$5 = (fyd.a)this.a.get($$4);
         if ($$5 != null) {
            cwn $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fui.a($$1, $$6), $$2, $$3, $$6.a(kv.G));
         }
      }
   }

   static record a(List<cwn> a, boolean b) {

      public cwn a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cwn.j : this.a.get($$0 % $$1);
      }
   }
}

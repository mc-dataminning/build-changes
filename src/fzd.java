import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class fzd {
   private final Reference2ObjectMap<cut, fzd.a> a = new Reference2ObjectArrayMap();
   private final fzm b;

   public fzd(fzm $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cut $$0, bak $$1, ddh $$2, boolean $$3) {
      List<cxh> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new fzd.a($$4, $$3));
      }
   }

   protected void a(cut $$0, bak $$1, ddh $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cut $$0, bak $$1, ddh $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(fpc $$0, fmg $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cxh $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gnh.O(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(fpc $$0, fmg $$1, int $$2, int $$3, @Nullable cut $$4) {
      if ($$4 != null) {
         fzd.a $$5 = (fzd.a)this.a.get($$4);
         if ($$5 != null) {
            cxh $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fvi.a($$1, $$6), $$2, $$3, $$6.a(kv.H));
         }
      }
   }

   static record a(List<cxh> a, boolean b) {

      public cxh a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cxh.k : this.a.get($$0 % $$1);
      }
   }
}

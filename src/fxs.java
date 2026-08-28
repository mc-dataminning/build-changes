import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class fxs {
   private final Reference2ObjectMap<cuy, fxs.a> a = new Reference2ObjectArrayMap();
   private final fyb b;

   public fxs(fyb $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cuy $$0, bbp $$1, ddo $$2, boolean $$3) {
      List<cxo> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new fxs.a($$4, $$3));
      }
   }

   protected void a(cuy $$0, bbp $$1, ddo $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cuy $$0, bbp $$1, ddo $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(fnr $$0, fmf $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cxo $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(glu.K(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(fnr $$0, fmf $$1, int $$2, int $$3, @Nullable cuy $$4) {
      if ($$4 != null) {
         fxs.a $$5 = (fxs.a)this.a.get($$4);
         if ($$5 != null) {
            cxo $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, ftx.a($$1, $$6), $$2, $$3, $$6.a(ku.G));
         }
      }
   }

   static record a(List<cxo> a, boolean b) {

      public cxo a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cxo.j : this.a.get($$0 % $$1);
      }
   }
}

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class gby {
   private final Reference2ObjectMap<cws, gby.a> a = new Reference2ObjectArrayMap();
   private final gch b;

   public gby(gch $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cws $$0, baz $$1, dfg $$2, boolean $$3) {
      List<czd> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new gby.a($$4, $$3));
      }
   }

   protected void a(cws $$0, baz $$1, dfg $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cws $$0, baz $$1, dfg $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(frv $$0, foz $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         czd $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gqk.P(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(frv $$0, foz $$1, int $$2, int $$3, @Nullable cws $$4) {
      if ($$4 != null) {
         gby.a $$5 = (gby.a)this.a.get($$4);
         if ($$5 != null) {
            czd $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fyb.a($$1, $$6), $$2, $$3, $$6.a(kj.G));
         }
      }
   }

   static record a(List<czd> a, boolean b) {

      public czd a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? czd.k : this.a.get($$0 % $$1);
      }
   }
}

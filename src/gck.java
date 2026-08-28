import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class gck {
   private final Reference2ObjectMap<cwz, gck.a> a = new Reference2ObjectArrayMap();
   private final gct b;

   public gck(gct $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cwz $$0, baz $$1, dfn $$2, boolean $$3) {
      List<czk> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new gck.a($$4, $$3));
      }
   }

   protected void a(cwz $$0, baz $$1, dfn $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cwz $$0, baz $$1, dfn $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(fsh $$0, fpo $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         czk $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gqx.P(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(fsh $$0, fpo $$1, int $$2, int $$3, @Nullable cwz $$4) {
      if ($$4 != null) {
         gck.a $$5 = (gck.a)this.a.get($$4);
         if ($$5 != null) {
            czk $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fyn.a($$1, $$6), $$2, $$3, $$6.a(kk.G));
         }
      }
   }

   static record a(List<czk> a, boolean b) {

      public czk a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? czk.k : this.a.get($$0 % $$1);
      }
   }
}

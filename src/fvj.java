import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class fvj {
   private final Reference2ObjectMap<ctp, fvj.a> a = new Reference2ObjectArrayMap();
   private final fvs b;

   public fvj(fvs $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   public void a(cwf $$0, ctp $$1) {
      this.a.put($$1, new fvj.a(List.of($$0), true));
   }

   public void a(List<cwf> $$0, ctp $$1) {
      this.a.put($$1, new fvj.a($$0, false));
   }

   public void a(flj $$0, fjx $$1, int $$2, int $$3, boolean $$4) {
      this.a.forEach(($$5, $$6) -> {
         int $$7 = $$5.e + $$2;
         int $$8 = $$5.f + $$3;
         if ($$6.b && $$4) {
            $$0.a($$7 - 4, $$8 - 4, $$7 + 20, $$8 + 20, 822018048);
         } else {
            $$0.a($$7, $$8, $$7 + 16, $$8 + 16, 822018048);
         }

         cwf $$9 = $$6.a(this.b.currentIndex());
         $$0.b($$9, $$7, $$8);
         $$0.a(gjh.J(), $$7, $$8, $$7 + 16, $$8 + 16, 822083583);
         if ($$6.b) {
            $$0.a($$1.h, $$9, $$7, $$8);
         }
      });
   }

   public void a(flj $$0, fjx $$1, int $$2, int $$3, @Nullable ctp $$4) {
      if ($$4 != null) {
         fvj.a $$5 = (fvj.a)this.a.get($$4);
         if ($$5 != null) {
            cwf $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, frp.a($$1, $$6), $$2, $$3, $$6.a(ku.G));
         }
      }
   }

   static record a(List<cwf> a, boolean b) {

      public cwf a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cwf.k : this.a.get($$0 % $$1);
      }
   }
}

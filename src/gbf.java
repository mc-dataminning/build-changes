import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class gbf {
   private final Reference2ObjectMap<cwh, gbf.a> a = new Reference2ObjectArrayMap();
   private final gbo b;

   public gbf(gbo $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   private void a(cwh $$0, bax $$1, dev $$2, boolean $$3) {
      List<cys> $$4 = $$2.a($$1);
      if (!$$4.isEmpty()) {
         this.a.put($$0, new gbf.a($$4, $$3));
      }
   }

   protected void a(cwh $$0, bax $$1, dev $$2) {
      this.a($$0, $$1, $$2, false);
   }

   protected void b(cwh $$0, bax $$1, dev $$2) {
      this.a($$0, $$1, $$2, true);
   }

   public void a(frc $$0, fof $$1, boolean $$2) {
      this.a.forEach(($$3, $$4) -> {
         int $$5 = $$3.e;
         int $$6 = $$3.f;
         if ($$4.b && $$2) {
            $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 822018048);
         } else {
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 822018048);
         }

         cys $$7 = $$4.a(this.b.currentIndex());
         $$0.b($$7, $$5, $$6);
         $$0.a(gpn.O(), $$5, $$6, $$5 + 16, $$6 + 16, 822083583);
         if ($$4.b) {
            $$0.a($$1.h, $$7, $$5, $$6);
         }
      });
   }

   public void a(frc $$0, fof $$1, int $$2, int $$3, @Nullable cwh $$4) {
      if ($$4 != null) {
         gbf.a $$5 = (gbf.a)this.a.get($$4);
         if ($$5 != null) {
            cys $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fxi.a($$1, $$6), $$2, $$3, $$6.a(kj.G));
         }
      }
   }

   static record a(List<cys> a, boolean b) {

      public cys a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cys.k : this.a.get($$0 % $$1);
      }
   }
}

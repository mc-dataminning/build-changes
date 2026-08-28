import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gkt {
   private static final int a = 2;
   private int b = 2;
   private final List<gky.b.a> c = new ObjectArrayList();

   public synchronized void a(gky.b.a $$0) {
      this.c.add($$0);
   }

   @Nullable
   public synchronized gky.b.a a(eyw $$0) {
      int $$1 = -1;
      int $$2 = -1;
      double $$3 = Double.MAX_VALUE;
      double $$4 = Double.MAX_VALUE;

      for (int $$5 = 0; $$5 < this.c.size(); $$5++) {
         gky.b.a $$6 = this.c.get($$5);
         double $$7 = $$6.d().b($$0);
         if (!$$6.c() && $$7 < $$3) {
            $$3 = $$7;
            $$1 = $$5;
         }

         if ($$6.c() && $$7 < $$4) {
            $$4 = $$7;
            $$2 = $$5;
         }
      }

      boolean $$8 = $$2 >= 0;
      boolean $$9 = $$1 >= 0;
      if (!$$8 || $$9 && (this.b <= 0 || !($$4 < $$3))) {
         this.b = 2;
         return this.a($$1);
      } else {
         this.b--;
         return this.a($$2);
      }
   }

   public int a() {
      return this.c.size();
   }

   @Nullable
   private gky.b.a a(int $$0) {
      return $$0 >= 0 ? this.c.remove($$0) : null;
   }

   public synchronized void b() {
      for (gky.b.a $$0 : this.c) {
         $$0.a();
      }

      this.c.clear();
   }
}

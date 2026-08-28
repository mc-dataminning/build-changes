import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;

public class gub {
   private static final int a = 2;
   private int b = 2;
   private final List<gug.b.a> c = new ObjectArrayList();

   public synchronized void a(gug.b.a $$0) {
      this.c.add($$0);
   }

   @Nullable
   public synchronized gug.b.a a(ffc $$0) {
      int $$1 = -1;
      int $$2 = -1;
      double $$3 = Double.MAX_VALUE;
      double $$4 = Double.MAX_VALUE;
      ListIterator<gug.b.a> $$5 = this.c.listIterator();

      while ($$5.hasNext()) {
         int $$6 = $$5.nextIndex();
         gug.b.a $$7 = $$5.next();
         if ($$7.a.get()) {
            $$5.remove();
         } else {
            double $$8 = $$7.d().b($$0);
            if (!$$7.c() && $$8 < $$3) {
               $$3 = $$8;
               $$1 = $$6;
            }

            if ($$7.c() && $$8 < $$4) {
               $$4 = $$8;
               $$2 = $$6;
            }
         }
      }

      boolean $$9 = $$2 >= 0;
      boolean $$10 = $$1 >= 0;
      if (!$$9 || $$10 && (this.b <= 0 || !($$4 < $$3))) {
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
   private gug.b.a a(int $$0) {
      return $$0 >= 0 ? this.c.remove($$0) : null;
   }

   public synchronized void b() {
      for (gug.b.a $$0 : this.c) {
         $$0.a();
      }

      this.c.clear();
   }
}

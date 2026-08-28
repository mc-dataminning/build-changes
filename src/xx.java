import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Optional;
import javax.annotation.Nullable;

public class xx {
   private final int a;
   private final ObjectList<xy> b = new ObjectArrayList();
   @Nullable
   private ya c;

   public xx(int $$0) {
      this.a = $$0;

      for (int $$1 = 0; $$1 < $$0; $$1++) {
         this.b.add(null);
      }
   }

   public void a(ya $$0) {
      if (!$$0.equals(this.c)) {
         this.b.add(new xy($$0, true));
         this.c = $$0;
      }
   }

   public int a() {
      return this.b.size();
   }

   public boolean a(int $$0) {
      int $$1 = this.b.size() - this.a;
      if ($$0 >= 0 && $$0 <= $$1) {
         this.b.removeElements(0, $$0);
         return true;
      } else {
         return false;
      }
   }

   public Optional<xv> a(xv.b $$0) {
      if (!this.a($$0.a())) {
         return Optional.empty();
      } else {
         ObjectList<ya> $$1 = new ObjectArrayList($$0.b().cardinality());
         if ($$0.b().length() > this.a) {
            return Optional.empty();
         } else {
            for (int $$2 = 0; $$2 < this.a; $$2++) {
               boolean $$3 = $$0.b().get($$2);
               xy $$4 = (xy)this.b.get($$2);
               if ($$3) {
                  if ($$4 == null) {
                     return Optional.empty();
                  }

                  this.b.set($$2, $$4.a());
                  $$1.add($$4.b());
               } else {
                  if ($$4 != null && !$$4.c()) {
                     return Optional.empty();
                  }

                  this.b.set($$2, null);
               }
            }

            return Optional.of(new xv($$1));
         }
      }
   }
}

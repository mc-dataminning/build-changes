import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

class he<T extends dw<T>> {
   @Nullable
   private List<gu<T>> a = new ArrayList<>();
   @Nullable
   private List<hg.a<T>> b;
   private final List<String> c = new ArrayList<>();

   public void a(gu<T> $$0) {
      if (this.b != null) {
         this.b.add(new hg.c<>($$0));
      } else {
         this.a.add($$0);
      }
   }

   private int a(String $$0) {
      int $$1 = this.c.indexOf($$0);
      if ($$1 == -1) {
         $$1 = this.c.size();
         this.c.add($$0);
      }

      return $$1;
   }

   private IntList a(List<String> $$0) {
      IntArrayList $$1 = new IntArrayList($$0.size());

      for (String $$2 : $$0) {
         $$1.add(this.a($$2));
      }

      return $$1;
   }

   public void a(String $$0, int $$1, T $$2) {
      hi $$3 = hi.a($$0, $$1);
      if (this.a != null) {
         this.b = new ArrayList<>(this.a.size() + 1);

         for (gu<T> $$4 : this.a) {
            this.b.add(new hg.c<>($$4));
         }

         this.a = null;
      }

      this.b.add(new hg.b<>($$3, this.a($$3.b()), $$2));
   }

   public hd<T> a(aiy $$0) {
      return (hd<T>)(this.b != null ? new hg<>($$0, this.b, this.c) : new hh<>($$0, this.a));
   }
}

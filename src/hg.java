import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

class hg<T extends dw<T>> {
   @Nullable
   private List<gw<T>> a = new ArrayList<>();
   @Nullable
   private List<hi.a<T>> b;
   private final List<String> c = new ArrayList<>();

   public void a(gw<T> $$0) {
      if (this.b != null) {
         this.b.add(new hi.c<>($$0));
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
      hk $$3 = hk.a($$0, $$1);
      if (this.a != null) {
         this.b = new ArrayList<>(this.a.size() + 1);

         for (gw<T> $$4 : this.a) {
            this.b.add(new hi.c<>($$4));
         }

         this.a = null;
      }

      this.b.add(new hi.b<>($$3, this.a($$3.b()), $$2));
   }

   public hf<T> a(ajh $$0) {
      return (hf<T>)(this.b != null ? new hi<>($$0, this.b, this.c) : new hj<>($$0, this.a));
   }
}

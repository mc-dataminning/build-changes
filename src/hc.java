import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

class hc<T extends dw<T>> {
   @Nullable
   private List<gs<T>> a = new ArrayList<>();
   @Nullable
   private List<he.a<T>> b;
   private final List<String> c = new ArrayList<>();

   public void a(gs<T> $$0) {
      if (this.b != null) {
         this.b.add(new he.c<>($$0));
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

   public void a(String $$0, int $$1) {
      hg $$2 = hg.a($$0, $$1);
      if (this.a != null) {
         this.b = new ArrayList<>(this.a.size() + 1);

         for (gs<T> $$3 : this.a) {
            this.b.add(new he.c<>($$3));
         }

         this.a = null;
      }

      this.b.add(new he.b<>($$2, this.a($$2.b())));
   }

   public hb<T> a(agm $$0) {
      return (hb<T>)(this.b != null ? new he<>($$0, this.b, this.c) : new hf<>($$0, this.a));
   }
}

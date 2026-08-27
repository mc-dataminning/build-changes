import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

class gy<T extends dw<T>> {
   @Nullable
   private List<gq<T>> a = new ArrayList<>();
   @Nullable
   private List<ha.a<T>> b;
   private final List<String> c = new ArrayList<>();

   public void a(gq<T> $$0) {
      if (this.b != null) {
         this.b.add(new ha.c<>($$0));
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
      hc $$2 = hc.a($$0, $$1);
      if (this.a != null) {
         this.b = new ArrayList<>(this.a.size() + 1);

         for (gq<T> $$3 : this.a) {
            this.b.add(new ha.c<>($$3));
         }

         this.a = null;
      }

      this.b.add(new ha.b<>($$2, this.a($$2.b())));
   }

   public gx<T> a(afw $$0) {
      return (gx<T>)(this.b != null ? new ha<>($$0, this.b, this.c) : new hb<>($$0, this.a));
   }
}

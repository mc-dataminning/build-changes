import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

class ik<T extends ex<T>> {
   @Nullable
   private List<hz<T>> a = new ArrayList<>();
   @Nullable
   private List<im.a<T>> b;
   private final List<String> c = new ArrayList<>();

   public void a(hz<T> $$0) {
      if (this.b != null) {
         this.b.add(new im.c<>($$0));
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
      io $$3 = io.a($$0, $$1);
      if (this.a != null) {
         this.b = new ArrayList<>(this.a.size() + 1);

         for (hz<T> $$4 : this.a) {
            this.b.add(new im.c<>($$4));
         }

         this.a = null;
      }

      this.b.add(new im.b<>($$3, this.a($$3.b()), $$2));
   }

   public ij<T> a(alh $$0) {
      return (ij<T>)(this.b != null ? new im<>($$0, this.b, this.c) : new in<>($$0, this.a));
   }
}

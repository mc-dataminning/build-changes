import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.BitSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class wa {
   private final wc[] a;
   private int b;
   private int c;
   @Nullable
   private we d;

   public wa(int $$0) {
      this.a = new wc[$$0];
   }

   public boolean a(we $$0, boolean $$1) {
      if (Objects.equals($$0, this.d)) {
         return false;
      } else {
         this.d = $$0;
         this.a($$1 ? new wc($$0, true) : null);
         return true;
      }
   }

   private void a(@Nullable wc $$0) {
      int $$1 = this.b;
      this.b = ($$1 + 1) % this.a.length;
      this.c++;
      this.a[$$1] = $$0;
   }

   public void a(we $$0) {
      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         wc $$2 = this.a[$$1];
         if ($$2 != null && $$2.c() && $$0.equals($$2.b())) {
            this.a[$$1] = null;
            break;
         }
      }
   }

   public int a() {
      int $$0 = this.c;
      this.c = 0;
      return $$0;
   }

   public wa.a b() {
      int $$0 = this.a();
      BitSet $$1 = new BitSet(this.a.length);
      ObjectList<we> $$2 = new ObjectArrayList(this.a.length);

      for (int $$3 = 0; $$3 < this.a.length; $$3++) {
         int $$4 = (this.b + $$3) % this.a.length;
         wc $$5 = this.a[$$4];
         if ($$5 != null) {
            $$1.set($$3, true);
            $$2.add($$5.b());
            this.a[$$4] = $$5.a();
         }
      }

      vz $$6 = new vz($$2);
      vz.b $$7 = new vz.b($$0, $$1);
      return new wa.a($$6, $$7);
   }

   public int c() {
      return this.c;
   }

   public static record a(vz a, vz.b b) {
   }
}

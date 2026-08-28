import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.BitSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class xi {
   private final xk[] a;
   private int b;
   private int c;
   @Nullable
   private xm d;

   public xi(int $$0) {
      this.a = new xk[$$0];
   }

   public boolean a(xm $$0, boolean $$1) {
      if (Objects.equals($$0, this.d)) {
         return false;
      } else {
         this.d = $$0;
         this.a($$1 ? new xk($$0, true) : null);
         return true;
      }
   }

   private void a(@Nullable xk $$0) {
      int $$1 = this.b;
      this.b = ($$1 + 1) % this.a.length;
      this.c++;
      this.a[$$1] = $$0;
   }

   public void a(xm $$0) {
      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         xk $$2 = this.a[$$1];
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

   public xi.a b() {
      int $$0 = this.a();
      BitSet $$1 = new BitSet(this.a.length);
      ObjectList<xm> $$2 = new ObjectArrayList(this.a.length);

      for (int $$3 = 0; $$3 < this.a.length; $$3++) {
         int $$4 = (this.b + $$3) % this.a.length;
         xk $$5 = this.a[$$4];
         if ($$5 != null) {
            $$1.set($$3, true);
            $$2.add($$5.b());
            this.a[$$4] = $$5.a();
         }
      }

      xh $$6 = new xh($$2);
      xh.b $$7 = new xh.b($$0, $$1);
      return new xi.a($$6, $$7);
   }

   public int c() {
      return this.c;
   }

   public static record a(xh a, xh.b b) {
   }
}

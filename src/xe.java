import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.BitSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class xe {
   private final xg[] a;
   private int b;
   private int c;
   @Nullable
   private xi d;

   public xe(int $$0) {
      this.a = new xg[$$0];
   }

   public boolean a(xi $$0, boolean $$1) {
      if (Objects.equals($$0, this.d)) {
         return false;
      } else {
         this.d = $$0;
         this.a($$1 ? new xg($$0, true) : null);
         return true;
      }
   }

   private void a(@Nullable xg $$0) {
      int $$1 = this.b;
      this.b = ($$1 + 1) % this.a.length;
      this.c++;
      this.a[$$1] = $$0;
   }

   public void a(xi $$0) {
      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         xg $$2 = this.a[$$1];
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

   public xe.a b() {
      int $$0 = this.a();
      BitSet $$1 = new BitSet(this.a.length);
      ObjectList<xi> $$2 = new ObjectArrayList(this.a.length);

      for (int $$3 = 0; $$3 < this.a.length; $$3++) {
         int $$4 = (this.b + $$3) % this.a.length;
         xg $$5 = this.a[$$4];
         if ($$5 != null) {
            $$1.set($$3, true);
            $$2.add($$5.b());
            this.a[$$4] = $$5.a();
         }
      }

      xd $$6 = new xd($$2);
      xd.b $$7 = new xd.b($$0, $$1);
      return new xe.a($$6, $$7);
   }

   public int c() {
      return this.c;
   }

   public static record a(xd a, xd.b b) {
   }
}

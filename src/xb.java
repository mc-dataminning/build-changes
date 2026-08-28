import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class xb {
   public static final int a = -1;
   private static final int b = 128;
   private final xa[] c;

   public xb(int $$0) {
      this.c = new xa[$$0];
   }

   public static xb a() {
      return new xb(128);
   }

   public int a(xa $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public xa a(int $$0) {
      return this.c[$$0];
   }

   public void a(xh $$0, @Nullable xa $$1) {
      List<xa> $$2 = $$0.d().a();
      ArrayDeque<xa> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<xa> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<xa> $$0) {
      Set<xa> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         xa $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

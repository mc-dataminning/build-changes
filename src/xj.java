import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class xj {
   public static final int a = -1;
   private static final int b = 128;
   private final xi[] c;

   public xj(int $$0) {
      this.c = new xi[$$0];
   }

   public static xj a() {
      return new xj(128);
   }

   public int a(xi $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public xi a(int $$0) {
      return this.c[$$0];
   }

   public void a(xp $$0, @Nullable xi $$1) {
      List<xi> $$2 = $$0.d().a();
      ArrayDeque<xi> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<xi> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<xi> $$0) {
      Set<xi> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         xi $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

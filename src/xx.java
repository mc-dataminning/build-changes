import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class xx {
   public static final int a = -1;
   private static final int b = 128;
   private final xw[] c;

   public xx(int $$0) {
      this.c = new xw[$$0];
   }

   public static xx a() {
      return new xx(128);
   }

   public int a(xw $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public xw a(int $$0) {
      return this.c[$$0];
   }

   public void a(yd $$0, @Nullable xw $$1) {
      List<xw> $$2 = $$0.d().a();
      ArrayDeque<xw> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<xw> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<xw> $$0) {
      Set<xw> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         xw $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

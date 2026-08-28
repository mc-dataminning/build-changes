import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class xc {
   public static final int a = -1;
   private static final int b = 128;
   private final xb[] c;

   public xc(int $$0) {
      this.c = new xb[$$0];
   }

   public static xc a() {
      return new xc(128);
   }

   public int a(xb $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public xb a(int $$0) {
      return this.c[$$0];
   }

   public void a(xi $$0, @Nullable xb $$1) {
      List<xb> $$2 = $$0.d().a();
      ArrayDeque<xb> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<xb> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<xb> $$0) {
      Set<xb> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         xb $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

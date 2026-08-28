import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class xv {
   public static final int a = -1;
   private static final int b = 128;
   private final xu[] c;

   public xv(int $$0) {
      this.c = new xu[$$0];
   }

   public static xv a() {
      return new xv(128);
   }

   public int a(xu $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public xu a(int $$0) {
      return this.c[$$0];
   }

   public void a(yb $$0, @Nullable xu $$1) {
      List<xu> $$2 = $$0.d().a();
      ArrayDeque<xu> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<xu> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<xu> $$0) {
      Set<xu> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         xu $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

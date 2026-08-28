import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class yi {
   public static final int a = -1;
   private static final int b = 128;
   private final yh[] c;

   public yi(int $$0) {
      this.c = new yh[$$0];
   }

   public static yi a() {
      return new yi(128);
   }

   public int a(yh $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public yh a(int $$0) {
      return this.c[$$0];
   }

   public void a(yo $$0, @Nullable yh $$1) {
      List<yh> $$2 = $$0.d().a();
      ArrayDeque<yh> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<yh> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<yh> $$0) {
      Set<yh> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         yh $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

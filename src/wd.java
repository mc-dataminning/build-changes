import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class wd {
   public static final int a = -1;
   private static final int b = 128;
   private final wc[] c;

   public wd(int $$0) {
      this.c = new wc[$$0];
   }

   public static wd a() {
      return new wd(128);
   }

   public int a(wc $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public wc a(int $$0) {
      return this.c[$$0];
   }

   public void a(wj $$0, @Nullable wc $$1) {
      List<wc> $$2 = $$0.d().a();
      ArrayDeque<wc> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<wc> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<wc> $$0) {
      Set<wc> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         wc $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class tq {
   public static final int a = -1;
   private static final int b = 128;
   private final tp[] c;

   public tq(int $$0) {
      this.c = new tp[$$0];
   }

   public static tq a() {
      return new tq(128);
   }

   public int a(tp $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public tp a(int $$0) {
      return this.c[$$0];
   }

   public void a(tt $$0) {
      List<tp> $$1 = $$0.l().d().a();
      ArrayDeque<tp> $$2 = new ArrayDeque<>($$1.size() + 1);
      $$2.addAll($$1);
      tp $$3 = $$0.k();
      if ($$3 != null) {
         $$2.add($$3);
      }

      this.a($$2);
   }

   @VisibleForTesting
   void a(List<tp> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<tp> $$0) {
      Set<tp> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         tp $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

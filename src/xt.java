import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class xt {
   public static final int a = -1;
   private static final int b = 128;
   private final xs[] c;

   public xt(int $$0) {
      this.c = new xs[$$0];
   }

   public static xt a() {
      return new xt(128);
   }

   public int a(xs $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public xs a(int $$0) {
      return this.c[$$0];
   }

   public void a(xz $$0, @Nullable xs $$1) {
      List<xs> $$2 = $$0.d().b();
      ArrayDeque<xs> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<xs> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<xs> $$0) {
      Set<xs> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         xs $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

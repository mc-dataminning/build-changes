import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class uv {
   public static final int a = -1;
   private static final int b = 128;
   private final uu[] c;

   public uv(int $$0) {
      this.c = new uu[$$0];
   }

   public static uv a() {
      return new uv(128);
   }

   public int a(uu $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public uu a(int $$0) {
      return this.c[$$0];
   }

   public void a(uy $$0) {
      List<uu> $$1 = $$0.l().d().a();
      ArrayDeque<uu> $$2 = new ArrayDeque<>($$1.size() + 1);
      $$2.addAll($$1);
      uu $$3 = $$0.k();
      if ($$3 != null) {
         $$2.add($$3);
      }

      this.a($$2);
   }

   @VisibleForTesting
   void a(List<uu> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<uu> $$0) {
      Set<uu> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         uu $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class vq {
   public static final int a = -1;
   private static final int b = 128;
   private final vp[] c;

   public vq(int $$0) {
      this.c = new vp[$$0];
   }

   public static vq a() {
      return new vq(128);
   }

   public int a(vp $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public vp a(int $$0) {
      return this.c[$$0];
   }

   public void a(vt $$0) {
      List<vp> $$1 = $$0.l().d().a();
      ArrayDeque<vp> $$2 = new ArrayDeque<>($$1.size() + 1);
      $$2.addAll($$1);
      vp $$3 = $$0.k();
      if ($$3 != null) {
         $$2.add($$3);
      }

      this.a($$2);
   }

   @VisibleForTesting
   void a(List<vp> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<vp> $$0) {
      Set<vp> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         vp $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

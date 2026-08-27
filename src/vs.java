import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class vs {
   public static final int a = -1;
   private static final int b = 128;
   private final vr[] c;

   public vs(int $$0) {
      this.c = new vr[$$0];
   }

   public static vs a() {
      return new vs(128);
   }

   public int a(vr $$0) {
      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         if ($$0.equals(this.c[$$1])) {
            return $$1;
         }
      }

      return -1;
   }

   @Nullable
   public vr a(int $$0) {
      return this.c[$$0];
   }

   public void a(vy $$0, @Nullable vr $$1) {
      List<vr> $$2 = $$0.d().a();
      ArrayDeque<vr> $$3 = new ArrayDeque<>($$2.size() + 1);
      $$3.addAll($$2);
      if ($$1 != null) {
         $$3.add($$1);
      }

      this.a($$3);
   }

   @VisibleForTesting
   void a(List<vr> $$0) {
      this.a(new ArrayDeque<>($$0));
   }

   private void a(ArrayDeque<vr> $$0) {
      Set<vr> $$1 = new ObjectOpenHashSet($$0);

      for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; $$2++) {
         vr $$3 = this.c[$$2];
         this.c[$$2] = $$0.removeLast();
         if ($$3 != null && !$$1.contains($$3)) {
            $$0.addFirst($$3);
         }
      }
   }
}

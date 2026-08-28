import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gmn {
   private static final Logger a = LogUtils.getLogger();
   private final Queue<gmm> b;
   private volatile int c;

   private gmn(List<gmm> $$0) {
      this.b = Queues.newArrayDeque($$0);
      this.c = this.b.size();
   }

   public static gmn a(int $$0) {
      int $$1 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / gmm.a);
      int $$2 = Math.max(1, Math.min($$0, $$1));
      List<gmm> $$3 = new ArrayList<>($$2);

      try {
         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(new gmm());
         }
      } catch (OutOfMemoryError var7) {
         a.warn("Allocated only {}/{} buffers", $$3.size(), $$2);
         int $$6 = Math.min($$3.size() * 2 / 3, $$3.size() - 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$3.remove($$3.size() - 1).close();
         }
      }

      return new gmn($$3);
   }

   @Nullable
   public gmm a() {
      gmm $$0 = this.b.poll();
      if ($$0 != null) {
         this.c = this.b.size();
         return $$0;
      } else {
         return null;
      }
   }

   public void a(gmm $$0) {
      this.b.add($$0);
      this.c = this.b.size();
   }

   public boolean b() {
      return this.b.isEmpty();
   }

   public int c() {
      return this.c;
   }
}

import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyc {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 4;
   private final Queue<fyb> c;
   private volatile int d;

   private fyc(List<fyb> $$0) {
      this.c = Queues.newArrayDeque($$0);
      this.d = this.c.size();
   }

   public static fyc a(int $$0) {
      int $$1 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / fyb.a);
      int $$2 = Math.max(1, Math.min($$0, $$1));
      List<fyb> $$3 = new ArrayList<>($$2);

      try {
         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(new fyb());
         }
      } catch (OutOfMemoryError var7) {
         b.warn("Allocated only {}/{} buffers", $$3.size(), $$2);
         int $$6 = Math.min($$3.size() * 2 / 3, $$3.size() - 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$3.remove($$3.size() - 1).close();
         }
      }

      return new fyc($$3);
   }

   @Nullable
   public fyb a() {
      fyb $$0 = this.c.poll();
      if ($$0 != null) {
         this.d = this.c.size();
         return $$0;
      } else {
         return null;
      }
   }

   public void a(fyb $$0) {
      this.c.add($$0);
      this.d = this.c.size();
   }

   public boolean b() {
      return this.c.isEmpty();
   }

   public int c() {
      return this.d;
   }
}

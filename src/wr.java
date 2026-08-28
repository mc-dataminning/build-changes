import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class wr extends wb {
   private static final Logger h = LogUtils.getLogger();
   private static final xh i = xh.c("disconnect.exceeded_packet_rate");
   private final int j;

   public wr(int $$0) {
      super(zp.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > (float)this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new zx(i), wo.a(() -> this.a(i)));
         this.m();
      }
   }
}

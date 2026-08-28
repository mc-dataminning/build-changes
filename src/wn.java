import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class wn extends vx {
   private static final Logger h = LogUtils.getLogger();
   private static final xd i = xd.c("disconnect.exceeded_packet_rate");
   private final int j;

   public wn(int $$0) {
      super(zl.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > (float)this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new zt(i), wk.a(() -> this.a(i)));
         this.m();
      }
   }
}

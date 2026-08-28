import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class wz extends wk {
   private static final Logger h = LogUtils.getLogger();
   private static final xp i = xp.c("disconnect.exceeded_packet_rate");
   private final int j;

   public wz(int $$0) {
      super(zx.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > (float)this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new aae(i), ww.a(() -> this.a(i)));
         this.m();
      }
   }
}

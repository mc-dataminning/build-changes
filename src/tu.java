import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class tu extends tj {
   private static final Logger j = LogUtils.getLogger();
   private static final ui k = ui.c("disconnect.exceeded_packet_rate");
   private final int l;

   public tu(int $$0) {
      super(wc.a);
      this.l = $$0;
   }

   @Override
   protected void e() {
      super.e();
      float $$0 = this.q();
      if ($$0 > (float)this.l) {
         j.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new wg(k), ts.a(() -> this.a(k)));
         this.o();
      }
   }
}

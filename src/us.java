import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class us extends uh {
   private static final Logger j = LogUtils.getLogger();
   private static final vg k = vg.c("disconnect.exceeded_packet_rate");
   private final int l;

   public us(int $$0) {
      super(xh.a);
      this.l = $$0;
   }

   @Override
   protected void e() {
      super.e();
      float $$0 = this.q();
      if ($$0 > (float)this.l) {
         j.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new xl(k), uq.a(() -> this.a(k)));
         this.o();
      }
   }
}

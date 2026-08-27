import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ud extends ts {
   private static final Logger j = LogUtils.getLogger();
   private static final ur k = ur.c("disconnect.exceeded_packet_rate");
   private final int l;

   public ud(int $$0) {
      super(wl.a);
      this.l = $$0;
   }

   @Override
   protected void e() {
      super.e();
      float $$0 = this.q();
      if ($$0 > (float)this.l) {
         j.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new wp(k), ub.a(() -> this.a(k)));
         this.o();
      }
   }
}

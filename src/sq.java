import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class sq extends sf {
   private static final Logger j = LogUtils.getLogger();
   private static final te k = te.c("disconnect.exceeded_packet_rate");
   private final int l;

   public sq(int $$0) {
      super(ux.a);
      this.l = $$0;
   }

   @Override
   protected void e() {
      super.e();
      float $$0 = this.q();
      if ($$0 > (float)this.l) {
         j.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new vb(k), so.a(() -> this.a(k)));
         this.o();
      }
   }
}

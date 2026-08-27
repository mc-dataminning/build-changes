import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class sm extends sd {
   private static final Logger i = LogUtils.getLogger();
   private static final sw j = sw.c("disconnect.exceeded_packet_rate");
   private final int k;

   public sm(int $$0) {
      super(up.a);
      this.k = $$0;
   }

   @Override
   protected void b() {
      super.b();
      float $$0 = this.n();
      if ($$0 > (float)this.k) {
         i.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new vs(j), sl.a(() -> this.a(j)));
         this.l();
      }
   }
}

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class wo extends vy {
   private static final Logger h = LogUtils.getLogger();
   private static final xe i = xe.c("disconnect.exceeded_packet_rate");
   private final int j;

   public wo(int $$0) {
      super(zm.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > (float)this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new zu(i), wl.a(() -> this.a(i)));
         this.m();
      }
   }
}

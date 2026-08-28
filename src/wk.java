import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class wk extends vt {
   private static final Logger h = LogUtils.getLogger();
   private static final xa i = xa.c("disconnect.exceeded_packet_rate");
   private final int j;

   public wk(int $$0) {
      super(zi.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > (float)this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new zq(i), wh.a(() -> this.a(i)));
         this.m();
      }
   }
}

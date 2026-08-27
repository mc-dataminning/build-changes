import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class wh extends vv {
   private static final Logger h = LogUtils.getLogger();
   private static final wx i = wx.c("disconnect.exceeded_packet_rate");
   private final int j;

   public wh(int $$0) {
      super(zf.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > (float)this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new zm(i), we.a(() -> this.a(i)));
         this.m();
      }
   }
}

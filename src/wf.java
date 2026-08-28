import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class wf extends vo {
   private static final Logger h = LogUtils.getLogger();
   private static final wv i = wv.c("disconnect.exceeded_packet_rate");
   private final int j;

   public wf(int $$0) {
      super(zd.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > (float)this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new zl(i), wc.a(() -> this.a(i)));
         this.m();
      }
   }
}

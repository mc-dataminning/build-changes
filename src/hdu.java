import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalLong;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.slf4j.Logger;

public class hdu {
   public static final hdu a = new hdu(Ticker.systemTicker());
   private static final Logger b = LogUtils.getLogger();
   private final Ticker c;
   private final Map<hdq<hdu.a>, Stopwatch> d = new HashMap<>();
   private OptionalLong e = OptionalLong.empty();

   protected hdu(Ticker $$0) {
      this.c = $$0;
   }

   public synchronized void a(hdq<hdu.a> $$0) {
      this.a($$0, (Function<hdq<hdu.a>, Stopwatch>)($$0x -> Stopwatch.createStarted(this.c)));
   }

   public synchronized void a(hdq<hdu.a> $$0, Stopwatch $$1) {
      this.a($$0, (Function<hdq<hdu.a>, Stopwatch>)($$1x -> $$1));
   }

   private synchronized void a(hdq<hdu.a> $$0, Function<hdq<hdu.a>, Stopwatch> $$1) {
      this.d.computeIfAbsent($$0, $$1);
   }

   public synchronized void b(hdq<hdu.a> $$0) {
      Stopwatch $$1 = this.d.get($$0);
      if ($$1 == null) {
         b.warn("Attempted to end step for {} before starting it", $$0.b());
      } else {
         if ($$1.isRunning()) {
            $$1.stop();
         }
      }
   }

   public void a(hdn $$0) {
      $$0.send(hdo.g, $$0x -> {
         synchronized (this) {
            this.d.forEach(($$1, $$2) -> {
               if (!$$2.isRunning()) {
                  long $$3 = $$2.elapsed(TimeUnit.MILLISECONDS);
                  $$0x.a((hdq<hdu.a>)$$1, new hdu.a((int)$$3));
               } else {
                  b.warn("Measurement {} was discarded since it was still ongoing when the event {} was sent.", $$1.b(), hdo.g.a());
               }
            });
            this.e.ifPresent($$1 -> $$0x.a(hdq.B, new hdu.a((int)$$1)));
            this.d.clear();
         }
      });
   }

   public synchronized void a(long $$0) {
      this.e = OptionalLong.of($$0);
   }

   public static record a(int b) {
      public static final Codec<hdu.a> a = Codec.INT.xmap(hdu.a::new, $$0 -> $$0.b);

      public int a() {
         return this.b;
      }
   }
}

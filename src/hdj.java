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

public class hdj {
   public static final hdj a = new hdj(Ticker.systemTicker());
   private static final Logger b = LogUtils.getLogger();
   private final Ticker c;
   private final Map<hdf<hdj.a>, Stopwatch> d = new HashMap<>();
   private OptionalLong e = OptionalLong.empty();

   protected hdj(Ticker $$0) {
      this.c = $$0;
   }

   public synchronized void a(hdf<hdj.a> $$0) {
      this.a($$0, (Function<hdf<hdj.a>, Stopwatch>)($$0x -> Stopwatch.createStarted(this.c)));
   }

   public synchronized void a(hdf<hdj.a> $$0, Stopwatch $$1) {
      this.a($$0, (Function<hdf<hdj.a>, Stopwatch>)($$1x -> $$1));
   }

   private synchronized void a(hdf<hdj.a> $$0, Function<hdf<hdj.a>, Stopwatch> $$1) {
      this.d.computeIfAbsent($$0, $$1);
   }

   public synchronized void b(hdf<hdj.a> $$0) {
      Stopwatch $$1 = this.d.get($$0);
      if ($$1 == null) {
         b.warn("Attempted to end step for {} before starting it", $$0.b());
      } else {
         if ($$1.isRunning()) {
            $$1.stop();
         }
      }
   }

   public void a(hdc $$0) {
      $$0.send(hdd.g, $$0x -> {
         synchronized (this) {
            this.d.forEach(($$1, $$2) -> {
               if (!$$2.isRunning()) {
                  long $$3 = $$2.elapsed(TimeUnit.MILLISECONDS);
                  $$0x.a((hdf<hdj.a>)$$1, new hdj.a((int)$$3));
               } else {
                  b.warn("Measurement {} was discarded since it was still ongoing when the event {} was sent.", $$1.b(), hdd.g.a());
               }
            });
            this.e.ifPresent($$1 -> $$0x.a(hdf.B, new hdj.a((int)$$1)));
            this.d.clear();
         }
      });
   }

   public synchronized void a(long $$0) {
      this.e = OptionalLong.of($$0);
   }

   public static record a(int b) {
      public static final Codec<hdj.a> a = Codec.INT.xmap(hdj.a::new, $$0 -> $$0.b);

      public int a() {
         return this.b;
      }
   }
}

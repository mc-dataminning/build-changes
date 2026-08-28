import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gqc implements gpu {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gqc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akk.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gqc::new)
   );
   private final akk d;
   private final Optional<akk> e;

   public gqc(akk $$0, Optional<akk> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(atw $$0, gpu.a $$1) {
      akk $$2 = a.a(this.d);
      Optional<atu> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpw a() {
      return gpx.a;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gpu implements gpm {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gpu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akk.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gpu::new)
   );
   private final akk d;
   private final Optional<akk> e;

   public gpu(akk $$0, Optional<akk> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(atu $$0, gpm.a $$1) {
      akk $$2 = a.a(this.d);
      Optional<ats> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpo a() {
      return gpp.a;
   }
}

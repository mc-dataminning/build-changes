import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gme implements glw {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gme> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajv.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ajv.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gme::new)
   );
   private final ajv d;
   private final Optional<ajv> e;

   public gme(ajv $$0, Optional<ajv> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ate $$0, glw.a $$1) {
      ajv $$2 = a.a(this.d);
      Optional<atc> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gly a() {
      return glz.a;
   }
}

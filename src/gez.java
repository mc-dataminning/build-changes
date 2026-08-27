import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gez implements ger {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gez> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ahg.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gez::new)
   );
   private final ahg d;
   private final Optional<ahg> e;

   public gez(ahg $$0, Optional<ahg> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aqi $$0, ger.a $$1) {
      ahg $$2 = a.a(this.d);
      Optional<aqg> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public get a() {
      return geu.a;
   }
}

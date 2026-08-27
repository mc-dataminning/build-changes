import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class ger implements gej {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ger> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahd.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ahd.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, ger::new)
   );
   private final ahd d;
   private final Optional<ahd> e;

   public ger(ahd $$0, Optional<ahd> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aqc $$0, gej.a $$1) {
      ahd $$2 = a.a(this.d);
      Optional<aqa> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gel a() {
      return gem.a;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class glv implements gln {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<glv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajt.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ajt.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, glv::new)
   );
   private final ajt d;
   private final Optional<ajt> e;

   public glv(ajt $$0, Optional<ajt> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(atc $$0, gln.a $$1) {
      ajt $$2 = a.a(this.d);
      Optional<ata> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public glp a() {
      return glq.a;
   }
}

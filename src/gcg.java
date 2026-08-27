import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gcg implements gby {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gcg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(agi.a.fieldOf("resource").forGetter($$0x -> $$0x.d), agi.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gcg::new)
   );
   private final agi d;
   private final Optional<agi> e;

   public gcg(agi $$0, Optional<agi> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aph $$0, gby.a $$1) {
      agi $$2 = a.a(this.d);
      Optional<apf> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gca a() {
      return gcb.a;
   }
}

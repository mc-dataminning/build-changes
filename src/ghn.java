import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class ghn implements ghf {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ghn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiy.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aiy.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, ghn::new)
   );
   private final aiy d;
   private final Optional<aiy> e;

   public ghn(aiy $$0, Optional<aiy> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(asb $$0, ghf.a $$1) {
      aiy $$2 = a.a(this.d);
      Optional<arz> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public ghh a() {
      return ghi.a;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gyp implements gyh {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gyp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ali.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gyp::new)
   );
   private final ali d;
   private final Optional<ali> e;

   public gyp(ali $$0, Optional<ali> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(avb $$0, gyh.a $$1) {
      ali $$2 = a.a(this.d);
      Optional<auz> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gyj a() {
      return gyk.a;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class goh implements gnz {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<goh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akn.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akn.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, goh::new)
   );
   private final akn d;
   private final Optional<akn> e;

   public goh(akn $$0, Optional<akn> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(atx $$0, gnz.a $$1) {
      akn $$2 = a.a(this.d);
      Optional<atv> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gob a() {
      return goc.a;
   }
}

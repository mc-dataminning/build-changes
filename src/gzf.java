import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gzf implements gyx {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gzf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(all.a.fieldOf("resource").forGetter($$0x -> $$0x.d), all.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gzf::new)
   );
   private final all d;
   private final Optional<all> e;

   public gzf(all $$0, Optional<all> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ave $$0, gyx.a $$1) {
      all $$2 = a.a(this.d);
      Optional<avc> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gyz a() {
      return gza.a;
   }
}

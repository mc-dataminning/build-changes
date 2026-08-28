import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class hfg implements hey {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hfg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akv.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akv.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, hfg::new)
   );
   private final akv d;
   private final Optional<akv> e;

   public hfg(akv $$0, Optional<akv> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aup $$0, hey.a $$1) {
      akv $$2 = a.a(this.d);
      Optional<aun> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hfa a() {
      return hfb.a;
   }
}

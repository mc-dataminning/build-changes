import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gam implements gae {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gam> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(afw.a.fieldOf("resource").forGetter($$0x -> $$0x.d), afw.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gam::new)
   );
   private final afw d;
   private final Optional<afw> e;

   public gam(afw $$0, Optional<afw> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aot $$0, gae.a $$1) {
      afw $$2 = a.a(this.d);
      Optional<aor> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gag a() {
      return gah.a;
   }
}

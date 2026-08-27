import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fys implements fyk {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<fys> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aep.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aep.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, fys::new)
   );
   private final aep d;
   private final Optional<aep> e;

   public fys(aep $$0, Optional<aep> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ank $$0, fyk.a $$1) {
      aep $$2 = a.a(this.d);
      Optional<ani> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fym a() {
      return fyn.a;
   }
}

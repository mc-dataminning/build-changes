import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gil implements gid {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gil> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajc.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ajc.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gil::new)
   );
   private final ajc d;
   private final Optional<ajc> e;

   public gil(ajc $$0, Optional<ajc> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(asf $$0, gid.a $$1) {
      ajc $$2 = a.a(this.d);
      Optional<asd> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gif a() {
      return gig.a;
   }
}

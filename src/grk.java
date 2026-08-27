import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class grk implements grc {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<grk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akt.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akt.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, grk::new)
   );
   private final akt d;
   private final Optional<akt> e;

   public grk(akt $$0, Optional<akt> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aud $$0, grc.a $$1) {
      akt $$2 = a.a(this.d);
      Optional<aub> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gre a() {
      return grf.a;
   }
}

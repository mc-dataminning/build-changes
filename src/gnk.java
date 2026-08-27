import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gnk implements gnc {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gnk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akh.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gnk::new)
   );
   private final akh d;
   private final Optional<akh> e;

   public gnk(akh $$0, Optional<akh> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(atr $$0, gnc.a $$1) {
      akh $$2 = a.a(this.d);
      Optional<atp> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gne a() {
      return gnf.a;
   }
}

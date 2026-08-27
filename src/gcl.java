import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gcl implements gcd {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gcl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(agm.a.fieldOf("resource").forGetter($$0x -> $$0x.d), agm.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gcl::new)
   );
   private final agm d;
   private final Optional<agm> e;

   public gcl(agm $$0, Optional<agm> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(apl $$0, gcd.a $$1) {
      agm $$2 = a.a(this.d);
      Optional<apj> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gcf a() {
      return gcg.a;
   }
}

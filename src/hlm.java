import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public record hlm(ali c, Optional<ali> d) implements hlf {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<hlm> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("resource").forGetter(hlm::b), ali.a.optionalFieldOf("sprite").forGetter(hlm::c)).apply($$0, hlm::new)
   );

   public hlm(ali $$0) {
      this($$0, Optional.empty());
   }

   @Override
   public void a(avf $$0, hlf.a $$1) {
      ali $$2 = a.a(this.c);
      Optional<avd> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.d.orElse(this.c), $$3.get());
      } else {
         e.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hlm> a() {
      return b;
   }

   public ali b() {
      return this.c;
   }

   public Optional<ali> c() {
      return this.d;
   }
}

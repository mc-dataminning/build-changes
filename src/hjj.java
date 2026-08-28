import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public record hjj(alg c, Optional<alg> d) implements hjc {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<hjj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("resource").forGetter(hjj::b), alg.a.optionalFieldOf("sprite").forGetter(hjj::c)).apply($$0, hjj::new)
   );

   public hjj(alg $$0) {
      this($$0, Optional.empty());
   }

   @Override
   public void a(avd $$0, hjc.a $$1) {
      alg $$2 = a.a(this.c);
      Optional<avb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.d.orElse(this.c), $$3.get());
      } else {
         e.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hjj> a() {
      return b;
   }

   public alg b() {
      return this.c;
   }

   public Optional<alg> c() {
      return this.d;
   }
}

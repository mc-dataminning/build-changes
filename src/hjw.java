import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public record hjw(alg c, Optional<alg> d) implements hjp {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<hjw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("resource").forGetter(hjw::b), alg.a.optionalFieldOf("sprite").forGetter(hjw::c)).apply($$0, hjw::new)
   );

   public hjw(alg $$0) {
      this($$0, Optional.empty());
   }

   @Override
   public void a(avd $$0, hjp.a $$1) {
      alg $$2 = a.a(this.c);
      Optional<avb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.d.orElse(this.c), $$3.get());
      } else {
         e.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hjw> a() {
      return b;
   }

   public alg b() {
      return this.c;
   }

   public Optional<alg> c() {
      return this.d;
   }
}

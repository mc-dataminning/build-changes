import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public record hlo(alk c, Optional<alk> d) implements hlh {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<hlo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a.fieldOf("resource").forGetter(hlo::b), alk.a.optionalFieldOf("sprite").forGetter(hlo::c)).apply($$0, hlo::new)
   );

   public hlo(alk $$0) {
      this($$0, Optional.empty());
   }

   @Override
   public void a(avh $$0, hlh.a $$1) {
      alk $$2 = a.a(this.c);
      Optional<avf> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.d.orElse(this.c), $$3.get());
      } else {
         e.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hlo> a() {
      return b;
   }

   public alk b() {
      return this.c;
   }

   public Optional<alk> c() {
      return this.d;
   }
}

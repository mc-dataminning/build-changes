import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public record hil(ale c, Optional<ale> d) implements hie {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<hil> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("resource").forGetter(hil::b), ale.a.optionalFieldOf("sprite").forGetter(hil::c)).apply($$0, hil::new)
   );

   public hil(ale $$0) {
      this($$0, Optional.empty());
   }

   @Override
   public void a(avb $$0, hie.a $$1) {
      ale $$2 = a.a(this.c);
      Optional<auz> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.d.orElse(this.c), $$3.get());
      } else {
         e.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hil> a() {
      return b;
   }

   public ale b() {
      return this.c;
   }

   public Optional<ale> c() {
      return this.d;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public record hlc(alr c, Optional<alr> d) implements hkv {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<hlc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alr.a.fieldOf("resource").forGetter(hlc::b), alr.a.optionalFieldOf("sprite").forGetter(hlc::c)).apply($$0, hlc::new)
   );

   public hlc(alr $$0) {
      this($$0, Optional.empty());
   }

   @Override
   public void a(avo $$0, hkv.a $$1) {
      alr $$2 = a.a(this.c);
      Optional<avm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.d.orElse(this.c), $$3.get());
      } else {
         e.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hlc> a() {
      return b;
   }

   public alr b() {
      return this.c;
   }

   public Optional<alr> c() {
      return this.d;
   }
}

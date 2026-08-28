import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class hhf implements hgx {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hhf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ald.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, hhf::new)
   );
   private final ald d;
   private final Optional<ald> e;

   public hhf(ald $$0, Optional<ald> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ava $$0, hgx.a $$1) {
      ald $$2 = a.a(this.d);
      Optional<auy> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hgz a() {
      return hha.a;
   }
}

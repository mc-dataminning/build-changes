import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gww implements gwo {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gww> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alb.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gww::new)
   );
   private final alb d;
   private final Optional<alb> e;

   public gww(alb $$0, Optional<alb> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aus $$0, gwo.a $$1) {
      alb $$2 = a.a(this.d);
      Optional<auq> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gwq a() {
      return gwr.a;
   }
}

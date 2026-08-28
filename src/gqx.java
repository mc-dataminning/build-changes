import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gqx implements gqp {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gqx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akr.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akr.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gqx::new)
   );
   private final akr d;
   private final Optional<akr> e;

   public gqx(akr $$0, Optional<akr> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aue $$0, gqp.a $$1) {
      akr $$2 = a.a(this.d);
      Optional<auc> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gqr a() {
      return gqs.a;
   }
}

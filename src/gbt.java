import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gbt implements gbl {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gbt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(agg.a.fieldOf("resource").forGetter($$0x -> $$0x.d), agg.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gbt::new)
   );
   private final agg d;
   private final Optional<agg> e;

   public gbt(agg $$0, Optional<agg> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(apd $$0, gbl.a $$1) {
      agg $$2 = a.a(this.d);
      Optional<apb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gbn a() {
      return gbo.a;
   }
}

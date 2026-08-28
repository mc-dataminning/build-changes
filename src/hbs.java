import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class hbs implements hbk {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hbs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alp.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alp.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, hbs::new)
   );
   private final alp d;
   private final Optional<alp> e;

   public hbs(alp $$0, Optional<alp> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(avl $$0, hbk.a $$1) {
      alp $$2 = a.a(this.d);
      Optional<avj> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hbm a() {
      return hbn.a;
   }
}

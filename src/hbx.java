import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class hbx implements hbp {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hbx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alz.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alz.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, hbx::new)
   );
   private final alz d;
   private final Optional<alz> e;

   public hbx(alz $$0, Optional<alz> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(avv $$0, hbp.a $$1) {
      alz $$2 = a.a(this.d);
      Optional<avt> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hbr a() {
      return hbs.a;
   }
}

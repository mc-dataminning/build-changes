import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fzm implements fze {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<fzm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aez.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aez.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, fzm::new)
   );
   private final aez d;
   private final Optional<aez> e;

   public fzm(aez $$0, Optional<aez> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(anw $$0, fze.a $$1) {
      aez $$2 = a.a(this.d);
      Optional<anu> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fzg a() {
      return fzh.a;
   }
}

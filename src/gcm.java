import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gcm implements gcd {
   public static final Codec<gcm> b = RecordCodecBuilder.create($$0 -> $$0.group(atx.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gcm::new));
   private final atx c;

   public gcm(atx $$0) {
      this.c = $$0;
   }

   @Override
   public void a(apl $$0, gcd.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gcf a() {
      return gcg.c;
   }
}

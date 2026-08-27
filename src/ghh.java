import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ghh implements ggy {
   public static final Codec<ghh> b = RecordCodecBuilder.create($$0 -> $$0.group(awp.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, ghh::new));
   private final awp c;

   public ghh(awp $$0) {
      this.c = $$0;
   }

   @Override
   public void a(asa $$0, ggy.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gha a() {
      return ghb.c;
   }
}

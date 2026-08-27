import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gez implements geq {
   public static final Codec<gez> b = RecordCodecBuilder.create($$0 -> $$0.group(auv.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gez::new));
   private final auv c;

   public gez(auv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aqh $$0, geq.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public ges a() {
      return get.c;
   }
}

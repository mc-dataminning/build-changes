import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gey implements gep {
   public static final Codec<gey> b = RecordCodecBuilder.create($$0 -> $$0.group(auv.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gey::new));
   private final auv c;

   public gey(auv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aqh $$0, gep.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public ger a() {
      return ges.c;
   }
}

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjc(azx c) implements hiu {
   public static final MapCodec<hjc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azx.a.fieldOf("pattern").forGetter(hjc::b)).apply($$0, hjc::new));

   @Override
   public void a(avd $$0, hiu.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hjc> a() {
      return b;
   }

   public azx b() {
      return this.c;
   }
}

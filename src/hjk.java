import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjk(azx c) implements hjc {
   public static final MapCodec<hjk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azx.a.fieldOf("pattern").forGetter(hjk::b)).apply($$0, hjk::new));

   @Override
   public void a(avd $$0, hjc.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hjk> a() {
      return b;
   }

   public azx b() {
      return this.c;
   }
}

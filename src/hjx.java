import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjx(azx c) implements hjp {
   public static final MapCodec<hjx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azx.a.fieldOf("pattern").forGetter(hjx::b)).apply($$0, hjx::new));

   @Override
   public void a(avd $$0, hjp.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hjx> a() {
      return b;
   }

   public azx b() {
      return this.c;
   }
}

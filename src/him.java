import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record him(azv c) implements hie {
   public static final MapCodec<him> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azv.a.fieldOf("pattern").forGetter(him::b)).apply($$0, him::new));

   @Override
   public void a(avb $$0, hie.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<him> a() {
      return b;
   }

   public azv b() {
      return this.c;
   }
}

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkd(azx c) implements hjv {
   public static final MapCodec<hkd> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azx.a.fieldOf("pattern").forGetter(hkd::b)).apply($$0, hkd::new));

   @Override
   public void a(avd $$0, hjv.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hkd> a() {
      return b;
   }

   public azx b() {
      return this.c;
   }
}

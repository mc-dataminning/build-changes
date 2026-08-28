import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hld(bak c) implements hkv {
   public static final MapCodec<hld> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bak.a.fieldOf("pattern").forGetter(hld::b)).apply($$0, hld::new));

   @Override
   public void a(avo $$0, hkv.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hld> a() {
      return b;
   }

   public bak b() {
      return this.c;
   }
}

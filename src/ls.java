import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ls(float c) implements lo {
   public static final MapCodec<ls> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, ls::new));
   public static final zf<ws, ls> b = zf.a(zd.j, $$0 -> $$0.c, ls::new);

   @Override
   public lp<ls> a() {
      return lq.J;
   }

   public float b() {
      return this.c;
   }
}

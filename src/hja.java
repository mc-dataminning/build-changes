import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hja(int c) implements hjg<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hjg.a<hja, String> b = hjg.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.l.optionalFieldOf("index", 0).forGetter(hja::c)).apply($$0, hja::new)), a
   );

   @Nullable
   public String a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      dct $$5 = $$0.a(kl.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hjg.a<hja, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

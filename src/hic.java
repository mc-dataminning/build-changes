import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hic(String c) implements hig<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hig.a<hic, String> b = hig.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hic::c)).apply($$0, hic::new)), a
   );

   @Nullable
   public String a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      dbn $$5 = $$0.a(kk.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hig.a<hic, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

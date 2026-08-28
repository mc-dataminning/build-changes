import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjo(String c) implements hjs<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hjs.a<hjo, String> b = hjs.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hjo::c)).apply($$0, hjo::new)), a
   );

   @Nullable
   public String a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      dca $$5 = $$0.a(kl.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hjs.a<hjo, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

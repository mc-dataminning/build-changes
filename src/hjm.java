import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjm(String c) implements hjq<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hjq.a<hjm, String> b = hjq.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hjm::c)).apply($$0, hjm::new)), a
   );

   @Nullable
   public String a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      dby $$5 = $$0.a(kk.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hjq.a<hjm, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

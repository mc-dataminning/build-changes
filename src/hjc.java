import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjc(String c) implements hjg<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hjg.a<hjc, String> b = hjg.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hjc::c)).apply($$0, hjc::new)), a
   );

   @Nullable
   public String a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      dck $$5 = $$0.a(kl.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hjg.a<hjc, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

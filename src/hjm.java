import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjm(int c) implements hjs<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hjs.a<hjm, String> b = hjs.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.l.optionalFieldOf("index", 0).forGetter(hjm::c)).apply($$0, hjm::new)), a
   );

   @Nullable
   public String a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      dcj $$5 = $$0.a(kl.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hjs.a<hjm, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

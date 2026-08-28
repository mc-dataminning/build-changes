import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjk(int c) implements hjq<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hjq.a<hjk, String> b = hjq.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.l.optionalFieldOf("index", 0).forGetter(hjk::c)).apply($$0, hjk::new)), a
   );

   @Nullable
   public String a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      dch $$5 = $$0.a(kk.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hjq.a<hjk, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

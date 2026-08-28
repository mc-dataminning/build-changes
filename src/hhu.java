import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhu(int c) implements hia<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hia.a<hhu, String> b = hia.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hhu::c)).apply($$0, hhu::new)), a
   );

   @Nullable
   public String a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      dbt $$5 = $$0.a(kk.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hia.a<hhu, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hia(int c) implements hig<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hig.a<hia, String> b = hig.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hia::c)).apply($$0, hia::new)), a
   );

   @Nullable
   public String a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      dbw $$5 = $$0.a(kk.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hig.a<hia, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

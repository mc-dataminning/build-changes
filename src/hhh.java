import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhh(int c) implements hhn<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hhn.a<hhh, String> b = hhn.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hhh::c)).apply($$0, hhh::new)), a
   );

   @Nullable
   public String a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      dbm $$5 = $$0.a(kj.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hhn.a<hhh, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgj(int c) implements hgp<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hgp.a<hgj, String> b = hgp.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.l.optionalFieldOf("index", 0).forGetter(hgj::c)).apply($$0, hgj::new)), a
   );

   @Nullable
   public String a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      dbb $$5 = $$0.a(kj.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hgp.a<hgj, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}

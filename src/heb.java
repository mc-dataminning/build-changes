import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record heb(kw<?> b, boolean c) implements hdw {
   public static final MapCodec<heb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(md.ao.q().fieldOf("component").forGetter(heb::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(heb::c))
            .apply($$0, heb::new)
   );

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<heb> a() {
      return a;
   }
}

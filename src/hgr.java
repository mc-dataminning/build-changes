import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgr(kt.a<?> b) implements hgt {
   public static final MapCodec<hgr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kt.a("predicate").forGetter(hgr::b)).apply($$0, hgr::new));

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hgr> a() {
      return a;
   }
}

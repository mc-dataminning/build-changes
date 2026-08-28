import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfq(ks.a<?> b) implements hfs {
   public static final MapCodec<hfq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ks.a("predicate").forGetter(hfq::b)).apply($$0, hfq::new));

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hfq> a() {
      return a;
   }
}

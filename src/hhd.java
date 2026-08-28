import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhd() implements hhf<bwv> {
   public static final Codec<bwv> a = bwv.c;
   public static final hhf.a<hhd, bwv> b = hhf.a.a(MapCodec.unit(new hhd()), a);

   @Nullable
   public bwv a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$2 == null ? null : $$2.fx();
   }

   @Override
   public hhf.a<hhd, bwv> a() {
      return b;
   }

   @Override
   public Codec<bwv> b() {
      return a;
   }
}

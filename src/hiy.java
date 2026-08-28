import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hiy() implements hjg<alq<dkj>> {
   public static final Codec<alq<dkj>> a = alq.a(mi.bp);
   public static final hjg.a<hiy, alq<dkj>> b = hjg.a.a(MapCodec.unit(new hiy()), a);

   @Nullable
   public alq<dkj> a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hjg.a<hiy, alq<dkj>> a() {
      return b;
   }

   @Override
   public Codec<alq<dkj>> b() {
      return a;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjh() implements hjg<alq<dix>> {
   public static final Codec<alq<dix>> a = alq.a(mi.bk);
   public static final hjg.a<hjh, alq<dix>> b = hjg.a.a(MapCodec.unit(new hjh()), a);

   @Nullable
   public alq<dix> a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      div $$5 = $$0.a(kl.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hjg.a<hjh, alq<dix>> a() {
      return b;
   }

   @Override
   public Codec<alq<dix>> b() {
      return a;
   }
}

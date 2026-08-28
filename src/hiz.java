import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hiz() implements hjg<alq<bxn<?>>> {
   public static final Codec<alq<bxn<?>>> a = alq.a(mi.B);
   public static final hjg.a<hiz, alq<bxn<?>>> b = hjg.a.a(MapCodec.unit(new hiz()), a);

   @Nullable
   public alq<bxn<?>> a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return $$2 == null ? null : $$2.an().r().h();
   }

   @Override
   public hjg.a<hiz, alq<bxn<?>>> a() {
      return b;
   }

   @Override
   public Codec<alq<bxn<?>>> b() {
      return a;
   }
}

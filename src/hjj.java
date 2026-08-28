import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjj() implements hjq<alh<bxc<?>>> {
   public static final Codec<alh<bxc<?>>> a = alh.a(mh.B);
   public static final hjq.a<hjj, alh<bxc<?>>> b = hjq.a.a(MapCodec.unit(new hjj()), a);

   @Nullable
   public alh<bxc<?>> a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$2 == null ? null : $$2.an().r().h();
   }

   @Override
   public hjq.a<hjj, alh<bxc<?>>> a() {
      return b;
   }

   @Override
   public Codec<alh<bxc<?>>> b() {
      return a;
   }
}

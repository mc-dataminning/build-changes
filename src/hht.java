import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hht() implements hia<alf<bwr<?>>> {
   public static final Codec<alf<bwr<?>>> a = alf.a(mh.B);
   public static final hia.a<hht, alf<bwr<?>>> b = hia.a.a(MapCodec.unit(new hht()), a);

   @Nullable
   public alf<bwr<?>> a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$2 == null ? null : $$2.an().r().h();
   }

   @Override
   public hia.a<hht, alf<bwr<?>>> a() {
      return b;
   }

   @Override
   public Codec<alf<bwr<?>>> b() {
      return a;
   }
}

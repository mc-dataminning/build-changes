import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhz() implements hig<alf<bwr<?>>> {
   public static final Codec<alf<bwr<?>>> a = alf.a(mh.B);
   public static final hig.a<hhz, alf<bwr<?>>> b = hig.a.a(MapCodec.unit(new hhz()), a);

   @Nullable
   public alf<bwr<?>> a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$2 == null ? null : $$2.an().r().h();
   }

   @Override
   public hig.a<hhz, alf<bwr<?>>> a() {
      return b;
   }

   @Override
   public Codec<alf<bwr<?>>> b() {
      return a;
   }
}

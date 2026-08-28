import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hih() implements hig<alf<dia>> {
   public static final Codec<alf<dia>> a = alf.a(mh.bk);
   public static final hig.a<hih, alf<dia>> b = hig.a.a(MapCodec.unit(new hih()), a);

   @Nullable
   public alf<dia> a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      dhy $$5 = $$0.a(kk.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hig.a<hih, alf<dia>> a() {
      return b;
   }

   @Override
   public Codec<alf<dia>> b() {
      return a;
   }
}

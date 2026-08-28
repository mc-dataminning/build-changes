import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhy() implements hig<alf<djm>> {
   public static final Codec<alf<djm>> a = alf.a(mh.bp);
   public static final hig.a<hhy, alf<djm>> b = hig.a.a(MapCodec.unit(new hhy()), a);

   @Nullable
   public alf<djm> a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hig.a<hhy, alf<djm>> a() {
      return b;
   }

   @Override
   public Codec<alf<djm>> b() {
      return a;
   }
}

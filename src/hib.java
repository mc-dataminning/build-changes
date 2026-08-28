import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hib() implements hig<czl> {
   public static final Codec<czl> a = czl.j;
   public static final hig.a<hib, czl> b = hig.a.a(MapCodec.unit(new hib()), a);

   public czl a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$4;
   }

   @Override
   public hig.a<hib, czl> a() {
      return b;
   }

   @Override
   public Codec<czl> b() {
      return a;
   }
}

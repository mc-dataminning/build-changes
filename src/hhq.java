import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhq() implements hia<cyd.a> {
   public static final Codec<cyd.a> a = cyd.a.d;
   public static final hia.a<hhq, cyd.a> b = hia.a.a(MapCodec.unit(new hhq()), a);

   public cyd.a a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      dbo $$5 = $$0.a(kk.P);
      if ($$5 == null || $$5.b()) {
         return cyd.a.a;
      } else {
         return $$5.a(czo.vE) ? cyd.a.c : cyd.a.b;
      }
   }

   @Override
   public hia.a<hhq, cyd.a> a() {
      return b;
   }

   @Override
   public Codec<cyd.a> b() {
      return a;
   }
}

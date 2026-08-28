import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjg() implements hjq<cyr.a> {
   public static final Codec<cyr.a> a = cyr.a.d;
   public static final hjq.a<hjg, cyr.a> b = hjq.a.a(MapCodec.unit(new hjg()), a);

   public cyr.a a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      dcc $$5 = $$0.a(kk.P);
      if ($$5 == null || $$5.b()) {
         return cyr.a.a;
      } else {
         return $$5.a(dac.vE) ? cyr.a.c : cyr.a.b;
      }
   }

   @Override
   public hjq.a<hjg, cyr.a> a() {
      return b;
   }

   @Override
   public Codec<cyr.a> b() {
      return a;
   }
}

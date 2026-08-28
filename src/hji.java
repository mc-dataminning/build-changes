import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hji() implements hjs<cyt.a> {
   public static final Codec<cyt.a> a = cyt.a.d;
   public static final hjs.a<hji, cyt.a> b = hjs.a.a(MapCodec.unit(new hji()), a);

   public cyt.a a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      dce $$5 = $$0.a(kl.P);
      if ($$5 == null || $$5.b()) {
         return cyt.a.a;
      } else {
         return $$5.a(dae.vE) ? cyt.a.c : cyt.a.b;
      }
   }

   @Override
   public hjs.a<hji, cyt.a> a() {
      return b;
   }

   @Override
   public Codec<cyt.a> b() {
      return a;
   }
}

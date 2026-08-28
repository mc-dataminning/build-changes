import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjt() implements hjs<alj<din>> {
   public static final Codec<alj<din>> a = alj.a(mi.bk);
   public static final hjs.a<hjt, alj<din>> b = hjs.a.a(MapCodec.unit(new hjt()), a);

   @Nullable
   public alj<din> a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      dil $$5 = $$0.a(kl.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hjs.a<hjt, alj<din>> a() {
      return b;
   }

   @Override
   public Codec<alj<din>> b() {
      return a;
   }
}

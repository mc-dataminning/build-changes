import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hho() implements hhn<alf<dhq>> {
   public static final Codec<alf<dhq>> a = alf.a(mg.bk);
   public static final hhn.a<hho, alf<dhq>> b = hhn.a.a(MapCodec.unit(new hho()), a);

   @Nullable
   public alf<dhq> a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      dho $$5 = $$0.a(kj.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hhn.a<hho, alf<dhq>> a() {
      return b;
   }

   @Override
   public Codec<alf<dhq>> b() {
      return a;
   }
}

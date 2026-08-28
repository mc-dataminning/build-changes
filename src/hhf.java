import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhf() implements hhn<alf<dja>> {
   public static final Codec<alf<dja>> a = alf.a(mg.bo);
   public static final hhn.a<hhf, alf<dja>> b = hhn.a.a(MapCodec.unit(new hhf()), a);

   @Nullable
   public alf<dja> a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hhn.a<hhf, alf<dja>> a() {
      return b;
   }

   @Override
   public Codec<alf<dja>> b() {
      return a;
   }
}

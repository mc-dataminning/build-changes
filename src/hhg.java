import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhg() implements hhn<alf<bwo<?>>> {
   public static final Codec<alf<bwo<?>>> a = alf.a(mg.B);
   public static final hhn.a<hhg, alf<bwo<?>>> b = hhn.a.a(MapCodec.unit(new hhg()), a);

   @Nullable
   public alf<bwo<?>> a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$2 == null ? null : $$2.aq().r().h();
   }

   @Override
   public hhn.a<hhg, alf<bwo<?>>> a() {
      return b;
   }

   @Override
   public Codec<alf<bwo<?>>> b() {
      return a;
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgi() implements hgp<ald<bwj<?>>> {
   public static final Codec<ald<bwj<?>>> a = ald.a(mg.B);
   public static final hgp.a<hgi, ald<bwj<?>>> b = hgp.a.a(MapCodec.unit(new hgi()), a);

   @Nullable
   public ald<bwj<?>> a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$2 == null ? null : $$2.aq().r().h();
   }

   @Override
   public hgp.a<hgi, ald<bwj<?>>> a() {
      return b;
   }

   @Override
   public Codec<ald<bwj<?>>> b() {
      return a;
   }
}

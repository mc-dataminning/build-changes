import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hje() implements hjg<bxw> {
   public static final Codec<bxw> a = bxw.c;
   public static final hjg.a<hje, bxw> b = hjg.a.a(MapCodec.unit(new hje()), a);

   @Nullable
   public bxw a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hjg.a<hje, bxw> a() {
      return b;
   }

   @Override
   public Codec<bxw> b() {
      return a;
   }
}

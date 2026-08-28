import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hda() implements hdc<buz> {
   public static final hdc.a<hda, buz> a = hdc.a.a(MapCodec.unit(new hda()), buz.c);

   @Nullable
   public buz a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hdc.a<hda, buz> a() {
      return a;
   }
}

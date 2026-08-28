import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hda() implements hcw {
   public static final MapCodec<hda> a = MapCodec.unit(new hda());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      if ($$2 instanceof cpr $$5 && $$5.cj != null) {
         bvr $$6 = gtk.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hda> a() {
      return a;
   }
}

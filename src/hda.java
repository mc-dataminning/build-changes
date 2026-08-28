import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hda() implements hdj<cvh.a> {
   public static final hdj.a<hda, cvh.a> a = hdj.a.a(MapCodec.unit(new hda()), cvh.a.d);

   public cvh.a a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      cyv $$5 = $$0.a(kv.O);
      if ($$5 == null || $$5.b()) {
         return cvh.a.a;
      } else {
         return $$5.a(cwu.vt) ? cvh.a.c : cvh.a.b;
      }
   }

   @Override
   public hdj.a<hda, cvh.a> a() {
      return a;
   }
}

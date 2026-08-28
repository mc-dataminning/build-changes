import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hef() implements heh<bvr> {
   public static final heh.a<hef, bvr> a = heh.a.a(MapCodec.unit(new hef()), bvr.c);

   @Nullable
   public bvr a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return $$2 == null ? null : $$2.fA();
   }

   @Override
   public heh.a<hef, bvr> a() {
      return a;
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hep implements hev<dvz> {
   private final gpr a;

   public hep(gpr $$0) {
      this.a = $$0;
   }

   @Nullable
   public dvz a(cxh $$0) {
      return $$0.a(kv.am);
   }

   public void a(@Nullable dvz $$0, cxf $$1, fgr $$2, gmx $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dvz.a));
   }

   public static record a() implements hev.a {
      public static final MapCodec<hep.a> a = MapCodec.unit(new hep.a());

      @Override
      public MapCodec<hep.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         return new hep(new gpr($$0));
      }
   }
}

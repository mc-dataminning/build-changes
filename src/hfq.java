import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hfq implements hfw<dwt> {
   private final gqt a;

   public hfq(gqt $$0) {
      this.a = $$0;
   }

   @Nullable
   public dwt a(cxy $$0) {
      return $$0.a(kx.am);
   }

   public void a(@Nullable dwt $$0, cxw $$1, fho $$2, gny $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dwt.a));
   }

   public static record a() implements hfw.a {
      public static final MapCodec<hfq.a> a = MapCodec.unit(new hfq.a());

      @Override
      public MapCodec<hfq.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         return new hfq(new gqt($$0));
      }
   }
}

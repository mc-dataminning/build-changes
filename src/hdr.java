import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdr implements hdx<dvh> {
   private final got a;

   public hdr(got $$0) {
      this.a = $$0;
   }

   @Nullable
   public dvh a(cwq $$0) {
      return $$0.a(kv.ak);
   }

   public void a(@Nullable dvh $$0, cwo $$1, ffv $$2, glz $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dvh.a));
   }

   public static record a() implements hdx.a {
      public static final MapCodec<hdr.a> a = MapCodec.unit(new hdr.a());

      @Override
      public MapCodec<hdr.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         return new hdr(new got($$0));
      }
   }
}

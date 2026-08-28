import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hik implements hiu<dxh> {
   private final gsy a;
   private final cyl b;

   public hik(cyl $$0, gsy $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dxh a(czn $$0) {
      return $$0.a(kk.am);
   }

   public void a(@Nullable dxh $$0, czl $$1, fkd $$2, gqr $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dxh.a));
   }

   public static record a(cyl b) implements hiu.a {
      public static final MapCodec<hik.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyl.q.fieldOf("color").forGetter(hik.a::b)).apply($$0, hik.a::new));

      @Override
      public MapCodec<hik.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         return new hik(this.b, new gsy($$0));
      }
   }
}

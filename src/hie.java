import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hie implements hio<dxc> {
   private final gst a;
   private final cyi b;

   public hie(cyi $$0, gst $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dxc a(czk $$0) {
      return $$0.a(kk.am);
   }

   public void a(@Nullable dxc $$0, czi $$1, fjy $$2, gqm $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dxc.a));
   }

   public static record a(cyi b) implements hio.a {
      public static final MapCodec<hie.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyi.q.fieldOf("color").forGetter(hie.a::b)).apply($$0, hie.a::new));

      @Override
      public MapCodec<hie.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         return new hie(this.b, new gst($$0));
      }
   }
}

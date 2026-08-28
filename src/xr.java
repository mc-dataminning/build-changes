import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xr {
   MapCodec<xr> c = wr.a(new xr.a[]{xs.b, xq.b, xz.b}, xr.a::a, xr::a, "source");

   Stream<tq> a(ex var1) throws CommandSyntaxException;

   xr.a<?> a();

   public static record a<T extends xr>(MapCodec<T> a, String b) implements azv {
      @Override
      public String c() {
         return this.b;
      }
   }
}

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xq {
   MapCodec<xq> c = wq.a(new xq.a[]{xr.b, xp.b, xy.b}, xq.a::a, xq::a, "source");

   Stream<tq> a(ex var1) throws CommandSyntaxException;

   xq.a<?> a();

   public static record a<T extends xq>(MapCodec<T> a, String b) implements azv {
      @Override
      public String c() {
         return this.b;
      }
   }
}

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface wh {
   MapCodec<wh> c = vh.a(new wh.a[]{wi.b, wg.b, wp.b}, wh.a::a, wh::a, "source");

   Stream<sn> a(ds var1) throws CommandSyntaxException;

   wh.a<?> a();

   public static record a<T extends wh>(MapCodec<T> a, String b) implements avj {
      @Override
      public String c() {
         return this.b;
      }
   }
}

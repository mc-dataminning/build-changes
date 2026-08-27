import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xz {
   MapCodec<xz> c = wz.a(new xz.a[]{ya.b, xy.b, yh.b}, xz.a::a, xz::a, "source");

   Stream<ud> a(ee var1) throws CommandSyntaxException;

   xz.a<?> a();

   public static record a<T extends xz>(MapCodec<T> a, String b) implements ayx {
      @Override
      public String c() {
         return this.b;
      }
   }
}

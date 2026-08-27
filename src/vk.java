import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface vk {
   MapCodec<vk> c = uk.a(new vk.a[]{vl.b, vj.b, vs.b}, vk.a::a, vk::a);

   Stream<rt> a(du var1) throws CommandSyntaxException;

   vk.a<?> a();

   public static record a<T extends vk>(MapCodec<T> a, String b) implements atr {
      @Override
      public String c() {
         return this.b;
      }
   }
}

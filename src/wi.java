import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface wi {
   MapCodec<wi> c = vi.a(new wi.a[]{wj.b, wh.b, wq.b}, wi.a::a, wi::a, "source");

   Stream<so> a(ds var1) throws CommandSyntaxException;

   wi.a<?> a();

   public static record a<T extends wi>(MapCodec<T> a, String b) implements avl {
      @Override
      public String c() {
         return this.b;
      }
   }
}

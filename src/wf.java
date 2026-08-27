import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface wf {
   MapCodec<wf> c = vf.a(new wf.a[]{wg.b, we.b, wn.b}, wf.a::a, wf::a, "source");

   Stream<sl> a(ds var1) throws CommandSyntaxException;

   wf.a<?> a();

   public static record a<T extends wf>(MapCodec<T> a, String b) implements ave {
      @Override
      public String c() {
         return this.b;
      }
   }
}

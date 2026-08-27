import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface vx {
   MapCodec<vx> c = ux.a(new vx.a[]{vy.b, vw.b, wf.b}, vx.a::a, vx::a, "source");

   Stream<sd> a(du var1) throws CommandSyntaxException;

   vx.a<?> a();

   public static record a<T extends vx>(MapCodec<T> a, String b) implements auk {
      @Override
      public String c() {
         return this.b;
      }
   }
}

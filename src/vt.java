import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface vt {
   MapCodec<vt> c = ut.a(new vt.a[]{vu.b, vs.b, wb.b}, vt.a::a, vt::a, "source");

   Stream<rz> a(du var1) throws CommandSyntaxException;

   vt.a<?> a();

   public static record a<T extends vt>(MapCodec<T> a, String b) implements aub {
      @Override
      public String c() {
         return this.b;
      }
   }
}

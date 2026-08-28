import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface vx<T extends vv> {
   vj a();

   yx b();

   yn<ByteBuf, yw<? super T>> c();

   @Nullable
   yv d();

   public interface a<T extends vv, B extends ByteBuf> {
      vx<T> a(Function<ByteBuf, B> var1);

      vj a();

      yx b();

      @bag
      void a(vx.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(yy<?> var1, int var2);
      }
   }
}

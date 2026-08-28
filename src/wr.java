import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wr<T extends wp> {
   we a();

   zr b();

   zh<ByteBuf, zq<? super T>> c();

   @Nullable
   zp d();

   public interface a<T extends wp, B extends ByteBuf> {
      wr<T> a(Function<ByteBuf, B> var1);

      we a();

      zr b();

      @bat
      void a(wr.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zs<?> var1, int var2);
      }
   }
}

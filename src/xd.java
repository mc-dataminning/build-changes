import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface xd<T extends xb> {
   wq a();

   aad b();

   zt<ByteBuf, aac<? super T>> c();

   @Nullable
   aab d();

   public interface a<T extends xb, B extends ByteBuf> {
      xd<T> a(Function<ByteBuf, B> var1);

      wq a();

      aad b();

      @bbl
      void a(xd.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(aae<?> var1, int var2);
      }
   }
}

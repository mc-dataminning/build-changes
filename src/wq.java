import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wq<T extends wo> {
   wd a();

   zq b();

   zg<ByteBuf, zp<? super T>> c();

   @Nullable
   zo d();

   public interface a<T extends wo, B extends ByteBuf> {
      wq<T> a(Function<ByteBuf, B> var1);

      wd a();

      zq b();

      @baq
      void a(wq.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zr<?> var1, int var2);
      }
   }
}

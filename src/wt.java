import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wt<T extends wr> {
   wg a();

   zt b();

   zj<ByteBuf, zs<? super T>> c();

   @Nullable
   zr d();

   public interface a<T extends wr, B extends ByteBuf> {
      wt<T> a(Function<ByteBuf, B> var1);

      wg a();

      zt b();

      @bau
      void a(wt.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zu<?> var1, int var2);
      }
   }
}

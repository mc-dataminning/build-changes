import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wk<T extends wi> {
   vw a();

   zk b();

   za<ByteBuf, zj<? super T>> c();

   @Nullable
   zi d();

   public interface a<T extends wi, B extends ByteBuf> {
      wk<T> a(Function<ByteBuf, B> var1);

      vw a();

      zk b();

      @baz
      void a(wk.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zl<?> var1, int var2);
      }
   }
}

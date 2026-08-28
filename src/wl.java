import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wl<T extends wj> {
   vy a();

   zl b();

   zb<ByteBuf, zk<? super T>> c();

   @Nullable
   zj d();

   public interface a<T extends wj, B extends ByteBuf> {
      wl<T> a(Function<ByteBuf, B> var1);

      vy a();

      zl b();

      @baj
      void a(wl.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zm<?> var1, int var2);
      }
   }
}

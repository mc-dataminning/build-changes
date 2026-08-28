import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wm<T extends wk> {
   vz a();

   zm b();

   zc<ByteBuf, zl<? super T>> c();

   @Nullable
   zk d();

   public interface a<T extends wk, B extends ByteBuf> {
      wm<T> a(Function<ByteBuf, B> var1);

      vz a();

      zm b();

      @bal
      void a(wm.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zn<?> var1, int var2);
      }
   }
}

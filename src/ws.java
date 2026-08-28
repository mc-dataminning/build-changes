import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface ws<T extends wq> {
   wf a();

   zs b();

   zi<ByteBuf, zr<? super T>> c();

   @Nullable
   zq d();

   public interface a<T extends wq, B extends ByteBuf> {
      ws<T> a(Function<ByteBuf, B> var1);

      wf a();

      zs b();

      @bbb
      void a(ws.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zt<?> var1, int var2);
      }
   }
}

import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wp<T extends wn> {
   wc a();

   zp b();

   zf<ByteBuf, zo<? super T>> c();

   @Nullable
   zn d();

   public interface a<T extends wn, B extends ByteBuf> {
      wp<T> a(Function<ByteBuf, B> var1);

      wc a();

      zp b();

      @bap
      void a(wp.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zq<?> var1, int var2);
      }
   }
}

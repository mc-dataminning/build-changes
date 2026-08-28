import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface vw<T extends vu> {
   vj a();

   yw b();

   ym<ByteBuf, yv<? super T>> c();

   @Nullable
   yu d();

   public interface a<T extends vu, B extends ByteBuf> {
      vw<T> a(Function<ByteBuf, B> var1);

      vj a();

      yw b();

      @baf
      void a(vw.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(yx<?> var1, int var2);
      }
   }
}

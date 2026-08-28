import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wh<T extends wf> {
   vu a();

   zh b();

   yx<ByteBuf, zg<? super T>> c();

   @Nullable
   zf d();

   public interface a<T extends wf, B extends ByteBuf> {
      wh<T> a(Function<ByteBuf, B> var1);

      vu a();

      zh b();

      @azt
      void a(wh.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zi<?> var1, int var2);
      }
   }
}

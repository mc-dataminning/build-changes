import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wt<T extends wr> {
   wk a();

   zt b();

   zj<ByteBuf, zs<? super T>> c();

   @Nullable
   zr d();

   public interface a<T extends wr, B extends ByteBuf> {
      wt<T> bind(Function<ByteBuf, B> var1);
   }
}

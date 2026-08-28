import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wx<T extends wv> {
   wl a();

   zx b();

   zn<ByteBuf, zw<? super T>> c();

   @Nullable
   zv d();

   public interface a<T extends wv, B extends ByteBuf> {
      wx<T> bind(Function<ByteBuf, B> var1);
   }
}

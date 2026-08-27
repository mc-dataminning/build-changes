import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wf<T extends wd> {
   vw a();

   zf b();

   yv<ByteBuf, ze<? super T>> c();

   @Nullable
   zd d();

   public interface a<T extends wd, B extends ByteBuf> {
      wf<T> bind(Function<ByteBuf, B> var1);
   }
}

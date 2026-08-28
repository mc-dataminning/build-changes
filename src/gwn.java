import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface gwn {
   Logger a = LogUtils.getLogger();

   static gwn create(Collection<atr<?>> $$0) {
      return ($$1, $$2) -> {
         auu $$3;
         try {
            $$3 = $$2.f().a($$0);
         } catch (Exception var9) {
            a.error("Unable to parse metadata from {}", $$1, var9);
            return null;
         }

         fbp $$7;
         try (InputStream $$6 = $$2.d()) {
            $$7 = fbp.a($$6);
         } catch (IOException var11) {
            a.error("Using missing texture, unable to load {}", $$1, var11);
            return null;
         }

         gxw $$11 = $$3.a(gxw.a).orElse(gxw.e);
         gxy $$12 = $$11.a($$7.a(), $$7.b());
         if (azc.c($$7.a(), $$12.a()) && azc.c($$7.b(), $$12.b())) {
            return new gwe($$1, $$12, $$7, $$3);
         } else {
            a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$1, $$7.a(), $$7.b(), $$12.a(), $$12.b()});
            $$7.close();
            return null;
         }
      };
   }

   @Nullable
   gwe loadSprite(alb var1, auq var2);
}

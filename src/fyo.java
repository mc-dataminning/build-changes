import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface fyo {
   Logger a = LogUtils.getLogger();

   static fyo create(Collection<amm<?>> $$0) {
      return ($$1, $$2) -> {
         ano $$3;
         try {
            $$3 = $$2.f().a($$0);
         } catch (Exception var9) {
            a.error("Unable to parse metadata from {}", $$1, var9);
            return null;
         }

         ekh $$7;
         try (InputStream $$6 = $$2.d()) {
            $$7 = ekh.a($$6);
         } catch (IOException var11) {
            a.error("Using missing texture, unable to load {}", $$1, var11);
            return null;
         }

         fzw $$11 = $$3.a(fzw.a).orElse(fzw.e);
         fzy $$12 = $$11.a($$7.a(), $$7.b());
         if (arp.c($$7.a(), $$12.a()) && arp.c($$7.b(), $$12.b())) {
            return new fyf($$1, $$12, $$7, $$3);
         } else {
            a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$1, $$7.a(), $$7.b(), $$12.a(), $$12.b()});
            $$7.close();
            return null;
         }
      };
   }

   @Nullable
   fyf loadSprite(aer var1, ank var2);
}

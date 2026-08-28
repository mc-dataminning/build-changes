import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface gyg {
   Logger a = LogUtils.getLogger();

   static gyg create(Collection<atz<?>> $$0) {
      return ($$1, $$2) -> {
         avd $$3;
         try {
            $$3 = $$2.f().a($$0);
         } catch (Exception var9) {
            a.error("Unable to parse metadata from {}", $$1, var9);
            return null;
         }

         fdb $$7;
         try (InputStream $$6 = $$2.d()) {
            $$7 = fdb.a($$6);
         } catch (IOException var11) {
            a.error("Using missing texture, unable to load {}", $$1, var11);
            return null;
         }

         gzp $$11 = $$3.a(gzp.a).orElse(gzp.e);
         gzr $$12 = $$11.a($$7.a(), $$7.b());
         if (azk.c($$7.a(), $$12.a()) && azk.c($$7.b(), $$12.b())) {
            return new gxx($$1, $$12, $$7, $$3);
         } else {
            a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$1, $$7.a(), $$7.b(), $$12.a(), $$12.b()});
            $$7.close();
            return null;
         }
      };
   }

   @Nullable
   gxx loadSprite(ali var1, auz var2);
}

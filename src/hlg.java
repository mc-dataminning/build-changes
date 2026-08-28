import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface hlg {
   Logger a = LogUtils.getLogger();

   static hlg create(Collection<aug<?>> $$0) {
      return ($$1, $$2) -> {
         avj $$3;
         try {
            $$3 = $$2.f().a($$0);
         } catch (Exception var9) {
            a.error("Unable to parse metadata from {}", $$1, var9);
            return null;
         }

         fki $$7;
         try (InputStream $$6 = $$2.d()) {
            $$7 = fki.a($$6);
         } catch (IOException var11) {
            a.error("Using missing texture, unable to load {}", $$1, var11);
            return null;
         }

         Optional<hmp> $$11 = $$3.a(hmp.b);
         hmq $$12;
         if ($$11.isPresent()) {
            $$12 = $$11.get().a($$7.a(), $$7.b());
            if (!azq.c($$7.a(), $$12.a()) || !azq.c($$7.b(), $$12.b())) {
               a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$1, $$7.a(), $$7.b(), $$12.a(), $$12.b()});
               $$7.close();
               return null;
            }
         } else {
            $$12 = new hmq($$7.a(), $$7.b());
         }

         return new hkw($$1, $$12, $$7, $$3);
      };
   }

   @Nullable
   hkw loadSprite(alk var1, avf var2);
}

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface hjb {
   Logger a = LogUtils.getLogger();

   static hjb create(Collection<auc<?>> $$0) {
      return ($$1, $$2) -> {
         avf $$3;
         try {
            $$3 = $$2.f().a($$0);
         } catch (Exception var9) {
            a.error("Unable to parse metadata from {}", $$1, var9);
            return null;
         }

         fik $$7;
         try (InputStream $$6 = $$2.d()) {
            $$7 = fik.a($$6);
         } catch (IOException var11) {
            a.error("Using missing texture, unable to load {}", $$1, var11);
            return null;
         }

         Optional<hkj> $$11 = $$3.a(hkj.b);
         hkk $$12;
         if ($$11.isPresent()) {
            $$12 = $$11.get().a($$7.a(), $$7.b());
            if (!azm.c($$7.a(), $$12.a()) || !azm.c($$7.b(), $$12.b())) {
               a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$1, $$7.a(), $$7.b(), $$12.a(), $$12.b()});
               $$7.close();
               return null;
            }
         } else {
            $$12 = new hkk($$7.a(), $$7.b());
         }

         return new hir($$1, $$12, $$7, $$3);
      };
   }

   @Nullable
   hir loadSprite(alg var1, avb var2);
}

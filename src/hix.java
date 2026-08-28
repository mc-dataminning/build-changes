import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hix extends hiv implements hiw {
   private static final Logger c = LogUtils.getLogger();
   @Nullable
   private fiu d;

   public hix(Supplier<String> $$0, fiu $$1) {
      this.d = $$1;
      this.a = new fjr($$0, fjs.a, this.d.a(), this.d.b(), 1);
      this.e();
   }

   public hix(String $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fiu($$1, $$2, $$3);
      this.a = new fjr($$0, fjs.a, this.d.a(), this.d.b(), 1);
   }

   public hix(Supplier<String> $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fiu($$1, $$2, $$3);
      this.a = new fjr($$0, fjs.a, this.d.a(), this.d.b(), 1);
   }

   public void e() {
      if (this.d != null && this.a != null) {
         this.a.a(this.d);
      } else {
         c.warn("Trying to upload disposed texture {}", this.d().e());
      }
   }

   @Nullable
   public fiu f() {
      return this.d;
   }

   public void a(fiu $$0) {
      if (this.d != null) {
         this.d.close();
      }

      this.d = $$0;
   }

   @Override
   public void close() {
      if (this.d != null) {
         this.d.close();
         this.d = null;
      }

      super.close();
   }

   @Override
   public void a(alg $$0, Path $$1) throws IOException {
      if (this.d != null) {
         String $$2 = $$0.c() + ".png";
         Path $$3 = $$1.resolve($$2);
         this.d.a($$3);
      }
   }
}

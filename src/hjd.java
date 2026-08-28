import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hjd extends hjb implements hjc {
   private static final Logger c = LogUtils.getLogger();
   @Nullable
   private fiz d;

   public hjd(Supplier<String> $$0, fiz $$1) {
      this.d = $$1;
      this.a = new fjw($$0, fjx.a, this.d.a(), this.d.b(), 1);
      this.c();
   }

   public hjd(String $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fiz($$1, $$2, $$3);
      this.a = new fjw($$0, fjx.a, this.d.a(), this.d.b(), 1);
   }

   public hjd(Supplier<String> $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fiz($$1, $$2, $$3);
      this.a = new fjw($$0, fjx.a, this.d.a(), this.d.b(), 1);
   }

   public void c() {
      if (this.d != null && this.a != null) {
         this.a.a(this.d);
      } else {
         c.warn("Trying to upload disposed texture {}", this.b().e());
      }
   }

   @Nullable
   public fiz d() {
      return this.d;
   }

   public void a(fiz $$0) {
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

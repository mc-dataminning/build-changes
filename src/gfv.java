import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gfv {
   gfv a = new gfv() {
      @Override
      public CompletableFuture<Optional<cpy>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gfv a(UserApiService $$0, fmq $$1, Path $$2) {
      return (gfv)($$1.g() == fmq.a.c ? new gfb($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cpy>> a();

   boolean b();
}

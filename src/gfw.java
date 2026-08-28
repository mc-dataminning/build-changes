import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gfw {
   gfw a = new gfw() {
      @Override
      public CompletableFuture<Optional<cpy>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gfw a(UserApiService $$0, fmr $$1, Path $$2) {
      return (gfw)($$1.g() == fmr.a.c ? new gfc($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cpy>> a();

   boolean b();
}

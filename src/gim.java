import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gim {
   gim a = new gim() {
      @Override
      public CompletableFuture<Optional<cqk>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gim a(UserApiService $$0, fnp $$1, Path $$2) {
      return (gim)($$1.g() == fnp.a.c ? new ghs($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cqk>> a();

   boolean b();
}

import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gky {
   gky a = new gky() {
      @Override
      public CompletableFuture<Optional<crm>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gky a(UserApiService $$0, fqa $$1, Path $$2) {
      return (gky)($$1.g() == fqa.a.c ? new gkd($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<crm>> a();

   boolean b();
}

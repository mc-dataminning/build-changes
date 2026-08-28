import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gbj {
   gbj a = new gbj() {
      @Override
      public CompletableFuture<Optional<cnr>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gbj a(UserApiService $$0, fio $$1, Path $$2) {
      return (gbj)($$1.g() == fio.a.c ? new gaq($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cnr>> a();

   boolean b();
}

import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mb implements lk {
   private final lm d;
   private final CompletableFuture<iy.a> e;

   public mb(lm $$0, CompletableFuture<iy.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(li $$0) {
      Path $$1 = this.d.a(lm.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ed> $$3 = new ee(ee.a.a, ee.a($$2)).a();
         return lk.a($$0, hz.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}

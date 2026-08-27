import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ku implements kf {
   private final kh d;
   private final CompletableFuture<id.b> e;

   public ku(kh $$0, CompletableFuture<id.b> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(kd $$0) {
      Path $$1 = this.d.a(kh.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<du> $$3 = new dv(dv.a.a, dv.a($$2)).a();
         return kf.a($$0, hh.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}

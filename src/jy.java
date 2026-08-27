import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jy implements jj {
   private final jl d;
   private final CompletableFuture<hh.b> e;

   public jy(jl $$0, CompletableFuture<hh.b> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(jh $$0) {
      Path $$1 = this.d.a(jl.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ds> $$3 = new dt(dt.a.a, dt.a($$2)).a();
         return jj.a($$0, gj.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}

import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gla {
   private static final int a = 1024;
   private final gkr b;
   private final gkx c;
   private final gkm d;
   @Nullable
   private gkw e;

   public gla(gkr $$0, gkx $$1, gkm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gla a(gkx $$0, UserApiService $$1) {
      gkm $$2 = new gkm(1024);
      gkr $$3 = gkr.a($$0, $$1);
      return new gla($$3, $$0, $$2);
   }

   public void a(fos $$0, fxu $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gkw $$4 = this.e.b();
         $$0.a(
            new fws(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wy.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wy.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wy.c("gui.abuseReport.draft.edit"),
               wy.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gkr a() {
      return this.b;
   }

   public gkm b() {
      return this.d;
   }

   public boolean a(gkx $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gkw $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

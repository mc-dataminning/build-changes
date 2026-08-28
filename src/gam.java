import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gam {
   private static final int a = 1024;
   private final gad b;
   private final gaj c;
   private final fzy d;
   @Nullable
   private gai e;

   public gam(gad $$0, gaj $$1, fzy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gam a(gaj $$0, UserApiService $$1) {
      fzy $$2 = new fzy(1024);
      gad $$3 = gad.a($$0, $$1);
      return new gam($$3, $$0, $$2);
   }

   public void a(fgm $$0, fob $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gai $$4 = this.e.b();
         $$0.a(
            new fmz(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wz.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wz.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wz.c("gui.abuseReport.draft.edit"),
               wz.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gad a() {
      return this.b;
   }

   public fzy b() {
      return this.d;
   }

   public boolean a(gaj $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gai $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fzd {
   private static final int a = 1024;
   private final fyu b;
   private final fza c;
   private final fyp d;
   @Nullable
   private fyz e;

   public fzd(fyu $$0, fza $$1, fyp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fzd a(fza $$0, UserApiService $$1) {
      fyp $$2 = new fyp(1024);
      fyu $$3 = fyu.a($$0, $$1);
      return new fzd($$3, $$0, $$2);
   }

   public void a(fff $$0, fnd $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fyz $$4 = this.e.b();
         $$0.a(
            new flv(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xp.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xp.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xp.c("gui.abuseReport.draft.edit"),
               xp.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fyu a() {
      return this.b;
   }

   public fyp b() {
      return this.d;
   }

   public boolean a(fza $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fyz $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fze {
   private static final int a = 1024;
   private final fyv b;
   private final fzb c;
   private final fyq d;
   @Nullable
   private fza e;

   public fze(fyv $$0, fzb $$1, fyq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fze a(fzb $$0, UserApiService $$1) {
      fyq $$2 = new fyq(1024);
      fyv $$3 = fyv.a($$0, $$1);
      return new fze($$3, $$0, $$2);
   }

   public void a(ffg $$0, fne $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fza $$4 = this.e.b();
         $$0.a(
            new flw(
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

   public fyv a() {
      return this.b;
   }

   public fyq b() {
      return this.d;
   }

   public boolean a(fzb $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fza $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

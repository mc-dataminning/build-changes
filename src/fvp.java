import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fvp {
   private static final int a = 1024;
   private final fvg b;
   private final fvm c;
   private final fvb d;
   @Nullable
   private fvl e;

   public fvp(fvg $$0, fvm $$1, fvb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fvp a(fvm $$0, UserApiService $$1) {
      fvb $$2 = new fvb(1024);
      fvg $$3 = fvg.a($$0, $$1);
      return new fvp($$3, $$0, $$2);
   }

   public void a(fbp $$0, fjo $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fvl $$4 = this.e.b();
         $$0.a(
            new fig(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wg.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wg.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wg.c("gui.abuseReport.draft.edit"),
               wg.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fvg a() {
      return this.b;
   }

   public fvb b() {
      return this.d;
   }

   public boolean a(fvm $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fvl $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

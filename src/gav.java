import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gav {
   private static final int a = 1024;
   private final gam b;
   private final gas c;
   private final gah d;
   @Nullable
   private gar e;

   public gav(gam $$0, gas $$1, gah $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gav a(gas $$0, UserApiService $$1) {
      gah $$2 = new gah(1024);
      gam $$3 = gam.a($$0, $$1);
      return new gav($$3, $$0, $$2);
   }

   public void a(fgj $$0, fon $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gar $$4 = this.e.b();
         $$0.a(
            new fne(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xe.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xe.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xe.c("gui.abuseReport.draft.edit"),
               xe.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gam a() {
      return this.b;
   }

   public gah b() {
      return this.d;
   }

   public boolean a(gas $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gar $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

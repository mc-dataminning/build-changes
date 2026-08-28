import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gnm {
   private static final int a = 1024;
   private final gnd b;
   private final gnj c;
   private final gmy d;
   @Nullable
   private gni e;

   public gnm(gnd $$0, gnj $$1, gmy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gnm a(gnj $$0, UserApiService $$1) {
      gmy $$2 = new gmy(1024);
      gnd $$3 = gnd.a($$0, $$1);
      return new gnm($$3, $$0, $$2);
   }

   public void a(frf $$0, gaf $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gni $$4 = this.e.b();
         $$0.a(
            new fzd(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xc.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xc.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xc.c("gui.abuseReport.draft.edit"),
               xc.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gnd a() {
      return this.b;
   }

   public gmy b() {
      return this.d;
   }

   public boolean a(gnj $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gni $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

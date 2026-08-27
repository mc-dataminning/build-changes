import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fxe {
   private static final int a = 1024;
   private final fwv b;
   private final fxb c;
   private final fwq d;
   @Nullable
   private fxa e;

   public fxe(fwv $$0, fxb $$1, fwq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fxe a(fxb $$0, UserApiService $$1) {
      fwq $$2 = new fwq(1024);
      fwv $$3 = fwv.a($$0, $$1);
      return new fxe($$3, $$0, $$2);
   }

   public void a(fde $$0, fld $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fxa $$4 = this.e.b();
         $$0.a(
            new fjv(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wu.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wu.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wu.c("gui.abuseReport.draft.edit"),
               wu.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fwv a() {
      return this.b;
   }

   public fwq b() {
      return this.d;
   }

   public boolean a(fxb $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fxa $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

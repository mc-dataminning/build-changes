import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fvy {
   private static final int a = 1024;
   private final fvp b;
   private final fvv c;
   private final fvk d;
   @Nullable
   private fvu e;

   public fvy(fvp $$0, fvv $$1, fvk $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fvy a(fvv $$0, UserApiService $$1) {
      fvk $$2 = new fvk(1024);
      fvp $$3 = fvp.a($$0, $$1);
      return new fvy($$3, $$0, $$2);
   }

   public void a(fby $$0, fjx $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fvu $$4 = this.e.b();
         $$0.a(
            new fip(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wi.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wi.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wi.c("gui.abuseReport.draft.edit"),
               wi.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fvp a() {
      return this.b;
   }

   public fvk b() {
      return this.d;
   }

   public boolean a(fvv $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fvu $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

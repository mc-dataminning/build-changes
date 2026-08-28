import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ggo {
   private static final int a = 1024;
   private final ggf b;
   private final ggl c;
   private final gga d;
   @Nullable
   private ggk e;

   public ggo(ggf $$0, ggl $$1, gga $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ggo a(ggl $$0, UserApiService $$1) {
      gga $$2 = new gga(1024);
      ggf $$3 = ggf.a($$0, $$1);
      return new ggo($$3, $$0, $$2);
   }

   public void a(flz $$0, ftr $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ggk $$4 = this.e.b();
         $$0.a(
            new fsp(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xk.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xk.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xk.c("gui.abuseReport.draft.edit"),
               xk.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public ggf a() {
      return this.b;
   }

   public gga b() {
      return this.d;
   }

   public boolean a(ggl $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ggk $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

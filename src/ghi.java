import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ghi {
   private static final int a = 1024;
   private final ggz b;
   private final ghf c;
   private final ggu d;
   @Nullable
   private ghe e;

   public ghi(ggz $$0, ghf $$1, ggu $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ghi a(ghf $$0, UserApiService $$1) {
      ggu $$2 = new ggu(1024);
      ggz $$3 = ggz.a($$0, $$1);
      return new ghi($$3, $$0, $$2);
   }

   public void a(flj $$0, ful $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ghe $$4 = this.e.b();
         $$0.a(
            new ftj(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wp.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wp.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wp.c("gui.abuseReport.draft.edit"),
               wp.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public ggz a() {
      return this.b;
   }

   public ggu b() {
      return this.d;
   }

   public boolean a(ghf $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ghe $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

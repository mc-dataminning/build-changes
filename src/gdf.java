import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gdf {
   private static final int a = 1024;
   private final gcw b;
   private final gdc c;
   private final gcr d;
   @Nullable
   private gdb e;

   public gdf(gcw $$0, gdc $$1, gcr $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gdf a(gdc $$0, UserApiService $$1) {
      gcr $$2 = new gcr(1024);
      gcw $$3 = gcw.a($$0, $$1);
      return new gdf($$3, $$0, $$2);
   }

   public void a(fja $$0, fqs $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gdb $$4 = this.e.b();
         $$0.a(
            new fpq(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xh.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xh.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xh.c("gui.abuseReport.draft.edit"),
               xh.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gcw a() {
      return this.b;
   }

   public gcr b() {
      return this.d;
   }

   public boolean a(gdc $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gdb $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

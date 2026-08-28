import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ggs {
   private static final int a = 1024;
   private final ggj b;
   private final ggp c;
   private final gge d;
   @Nullable
   private ggo e;

   public ggs(ggj $$0, ggp $$1, gge $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ggs a(ggp $$0, UserApiService $$1) {
      gge $$2 = new gge(1024);
      ggj $$3 = ggj.a($$0, $$1);
      return new ggs($$3, $$0, $$2);
   }

   public void a(fmf $$0, ftx $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ggo $$4 = this.e.b();
         $$0.a(
            new fsv(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xv.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xv.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xv.c("gui.abuseReport.draft.edit"),
               xv.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public ggj a() {
      return this.b;
   }

   public gge b() {
      return this.d;
   }

   public boolean a(ggp $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ggo $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

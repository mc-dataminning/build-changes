import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ggt {
   private static final int a = 1024;
   private final ggk b;
   private final ggq c;
   private final ggf d;
   @Nullable
   private ggp e;

   public ggt(ggk $$0, ggq $$1, ggf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ggt a(ggq $$0, UserApiService $$1) {
      ggf $$2 = new ggf(1024);
      ggk $$3 = ggk.a($$0, $$1);
      return new ggt($$3, $$0, $$2);
   }

   public void a(fmg $$0, fty $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ggp $$4 = this.e.b();
         $$0.a(
            new fsw(
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

   public ggk a() {
      return this.b;
   }

   public ggf b() {
      return this.d;
   }

   public boolean a(ggq $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ggp $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}

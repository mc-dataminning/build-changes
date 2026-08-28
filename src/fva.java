import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fva {
   private static final wv b = wv.c("gui.banned.title.temporary").a(n.r);
   private static final wv c = wv.c("gui.banned.title.permanent").a(n.r);
   public static final wv a = wv.c("gui.banned.name.title").a(n.r);
   private static final wv d = wv.c("gui.banned.skin.title").a(n.r);
   private static final wv e = wv.a("gui.banned.skin.description", wv.a(ayf.n));

   public static fvc a(BooleanConsumer $$0, BanDetails $$1) {
      return new fvc($$0, a($$1), b($$1), ayf.n, wu.m, true);
   }

   public static fvc a(Runnable $$0) {
      URI $$1 = ayf.n;
      return new fvc($$2 -> {
         if ($$2) {
            af.n().a($$1);
         }

         $$0.run();
      }, d, e, $$1, wu.m, true);
   }

   public static fvc a(String $$0, Runnable $$1) {
      URI $$2 = ayf.n;
      return new fvc($$2x -> {
         if ($$2x) {
            af.n().a($$2);
         }

         $$1.run();
      }, a, wv.a("gui.banned.name.description", wv.b($$0).a(n.o), wv.a(ayf.n)), $$2, wu.m, true);
   }

   private static wv a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wv b(BanDetails $$0) {
      return wv.a("gui.banned.description", c($$0), d($$0), wv.a(ayf.n));
   }

   private static wv c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gja $$4 = gja.a($$3);
         wv $$5;
         if ($$4 != null) {
            $$5 = wy.a($$4.a().f(), xs.a.a(true));
         } else if ($$2 != null) {
            $$5 = wv.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wv.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wv.a("gui.banned.description.reason", $$5);
      } else {
         return wv.c("gui.banned.description.unknownreason");
      }
   }

   private static wv d(BanDetails $$0) {
      if (f($$0)) {
         wv $$1 = e($$0);
         return wv.a("gui.banned.description.temporary", wv.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wv.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wv e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wu.a($$1.toDays());
      } else {
         return $$2 < 1L ? wu.c($$1.toMinutes()) : wu.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}

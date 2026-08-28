import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fwd {
   private static final ww b = ww.c("gui.banned.title.temporary").a(n.r);
   private static final ww c = ww.c("gui.banned.title.permanent").a(n.r);
   public static final ww a = ww.c("gui.banned.name.title").a(n.r);
   private static final ww d = ww.c("gui.banned.skin.title").a(n.r);
   private static final ww e = ww.a("gui.banned.skin.description", ww.a(ayf.n));

   public static fwf a(BooleanConsumer $$0, BanDetails $$1) {
      return new fwf($$0, a($$1), b($$1), ayf.n, wv.m, true);
   }

   public static fwf a(Runnable $$0) {
      URI $$1 = ayf.n;
      return new fwf($$2 -> {
         if ($$2) {
            af.n().a($$1);
         }

         $$0.run();
      }, d, e, $$1, wv.m, true);
   }

   public static fwf a(String $$0, Runnable $$1) {
      URI $$2 = ayf.n;
      return new fwf($$2x -> {
         if ($$2x) {
            af.n().a($$2);
         }

         $$1.run();
      }, a, ww.a("gui.banned.name.description", ww.b($$0).a(n.o), ww.a(ayf.n)), $$2, wv.m, true);
   }

   private static ww a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static ww b(BanDetails $$0) {
      return ww.a("gui.banned.description", c($$0), d($$0), ww.a(ayf.n));
   }

   private static ww c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gke $$4 = gke.a($$3);
         ww $$5;
         if ($$4 != null) {
            $$5 = wz.a($$4.a().f(), xt.a.a(true));
         } else if ($$2 != null) {
            $$5 = ww.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = ww.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return ww.a("gui.banned.description.reason", $$5);
      } else {
         return ww.c("gui.banned.description.unknownreason");
      }
   }

   private static ww d(BanDetails $$0) {
      if (f($$0)) {
         ww $$1 = e($$0);
         return ww.a("gui.banned.description.temporary", ww.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return ww.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static ww e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wv.a($$1.toDays());
      } else {
         return $$2 < 1L ? wv.c($$1.toMinutes()) : wv.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}

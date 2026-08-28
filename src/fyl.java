import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fyl {
   private static final xg b = xg.c("gui.banned.title.temporary").a(o.r);
   private static final xg c = xg.c("gui.banned.title.permanent").a(o.r);
   public static final xg a = xg.c("gui.banned.name.title").a(o.r);
   private static final xg d = xg.c("gui.banned.skin.title").a(o.r);
   private static final xg e = xg.a("gui.banned.skin.description", xg.a(ayt.n));

   public static fyn a(BooleanConsumer $$0, BanDetails $$1) {
      return new fyn($$0, a($$1), b($$1), ayt.n, xf.m, true);
   }

   public static fyn a(Runnable $$0) {
      URI $$1 = ayt.n;
      return new fyn($$2 -> {
         if ($$2) {
            ag.n().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xf.m, true);
   }

   public static fyn a(String $$0, Runnable $$1) {
      URI $$2 = ayt.n;
      return new fyn($$2x -> {
         if ($$2x) {
            ag.n().a($$2);
         }

         $$1.run();
      }, a, xg.a("gui.banned.name.description", xg.b($$0).a(o.o), xg.a(ayt.n)), $$2, xf.m, true);
   }

   private static xg a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xg b(BanDetails $$0) {
      return xg.a("gui.banned.description", c($$0), d($$0), xg.a(ayt.n));
   }

   private static xg c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gmp $$4 = gmp.a($$3);
         xg $$5;
         if ($$4 != null) {
            $$5 = xj.a($$4.a().f(), yd.a.a(true));
         } else if ($$2 != null) {
            $$5 = xg.a("gui.banned.description.reason_id_message", $$3, $$2).a(o.r);
         } else {
            $$5 = xg.a("gui.banned.description.reason_id", $$3).a(o.r);
         }

         return xg.a("gui.banned.description.reason", $$5);
      } else {
         return xg.c("gui.banned.description.unknownreason");
      }
   }

   private static xg d(BanDetails $$0) {
      if (f($$0)) {
         xg $$1 = e($$0);
         return xg.a("gui.banned.description.temporary", xg.a("gui.banned.description.temporary.duration", $$1).a(o.r));
      } else {
         return xg.c("gui.banned.description.permanent").a(o.r);
      }
   }

   private static xg e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xf.a($$1.toDays());
      } else {
         return $$2 < 1L ? xf.c($$1.toMinutes()) : xf.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}

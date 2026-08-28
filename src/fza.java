import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fza {
   private static final xc b = xc.c("gui.banned.title.temporary").a(o.r);
   private static final xc c = xc.c("gui.banned.title.permanent").a(o.r);
   public static final xc a = xc.c("gui.banned.name.title").a(o.r);
   private static final xc d = xc.c("gui.banned.skin.title").a(o.r);
   private static final xc e = xc.a("gui.banned.skin.description", xc.a(ayl.n));

   public static fzc a(BooleanConsumer $$0, BanDetails $$1) {
      return new fzc($$0, a($$1), b($$1), ayl.n, xb.m, true);
   }

   public static fzc a(Runnable $$0) {
      URI $$1 = ayl.n;
      return new fzc($$2 -> {
         if ($$2) {
            ag.n().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xb.m, true);
   }

   public static fzc a(String $$0, Runnable $$1) {
      URI $$2 = ayl.n;
      return new fzc($$2x -> {
         if ($$2x) {
            ag.n().a($$2);
         }

         $$1.run();
      }, a, xc.a("gui.banned.name.description", xc.b($$0).a(o.o), xc.a(ayl.n)), $$2, xb.m, true);
   }

   private static xc a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xc b(BanDetails $$0) {
      return xc.a("gui.banned.description", c($$0), d($$0), xc.a(ayl.n));
   }

   private static xc c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gne $$4 = gne.a($$3);
         xc $$5;
         if ($$4 != null) {
            $$5 = xf.a($$4.a().f(), xz.a.a(true));
         } else if ($$2 != null) {
            $$5 = xc.a("gui.banned.description.reason_id_message", $$3, $$2).a(o.r);
         } else {
            $$5 = xc.a("gui.banned.description.reason_id", $$3).a(o.r);
         }

         return xc.a("gui.banned.description.reason", $$5);
      } else {
         return xc.c("gui.banned.description.unknownreason");
      }
   }

   private static xc d(BanDetails $$0) {
      if (f($$0)) {
         xc $$1 = e($$0);
         return xc.a("gui.banned.description.temporary", xc.a("gui.banned.description.temporary.duration", $$1).a(o.r));
      } else {
         return xc.c("gui.banned.description.permanent").a(o.r);
      }
   }

   private static xc e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xb.a($$1.toDays());
      } else {
         return $$2 < 1L ? xb.c($$1.toMinutes()) : xb.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}

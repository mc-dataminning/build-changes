import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fyy {
   private static final xa b = xa.c("gui.banned.title.temporary").a(o.r);
   private static final xa c = xa.c("gui.banned.title.permanent").a(o.r);
   public static final xa a = xa.c("gui.banned.name.title").a(o.r);
   private static final xa d = xa.c("gui.banned.skin.title").a(o.r);
   private static final xa e = xa.a("gui.banned.skin.description", xa.a(ayj.n));

   public static fza a(BooleanConsumer $$0, BanDetails $$1) {
      return new fza($$0, a($$1), b($$1), ayj.n, wz.m, true);
   }

   public static fza a(Runnable $$0) {
      URI $$1 = ayj.n;
      return new fza($$2 -> {
         if ($$2) {
            ag.n().a($$1);
         }

         $$0.run();
      }, d, e, $$1, wz.m, true);
   }

   public static fza a(String $$0, Runnable $$1) {
      URI $$2 = ayj.n;
      return new fza($$2x -> {
         if ($$2x) {
            ag.n().a($$2);
         }

         $$1.run();
      }, a, xa.a("gui.banned.name.description", xa.b($$0).a(o.o), xa.a(ayj.n)), $$2, wz.m, true);
   }

   private static xa a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xa b(BanDetails $$0) {
      return xa.a("gui.banned.description", c($$0), d($$0), xa.a(ayj.n));
   }

   private static xa c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gnc $$4 = gnc.a($$3);
         xa $$5;
         if ($$4 != null) {
            $$5 = xd.a($$4.a().f(), xx.a.a(true));
         } else if ($$2 != null) {
            $$5 = xa.a("gui.banned.description.reason_id_message", $$3, $$2).a(o.r);
         } else {
            $$5 = xa.a("gui.banned.description.reason_id", $$3).a(o.r);
         }

         return xa.a("gui.banned.description.reason", $$5);
      } else {
         return xa.c("gui.banned.description.unknownreason");
      }
   }

   private static xa d(BanDetails $$0) {
      if (f($$0)) {
         xa $$1 = e($$0);
         return xa.a("gui.banned.description.temporary", xa.a("gui.banned.description.temporary.duration", $$1).a(o.r));
      } else {
         return xa.c("gui.banned.description.permanent").a(o.r);
      }
   }

   private static xa e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wz.a($$1.toDays());
      } else {
         return $$2 < 1L ? wz.c($$1.toMinutes()) : wz.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}

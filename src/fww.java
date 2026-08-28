import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fww {
   private static final wy b = wy.c("gui.banned.title.temporary").a(n.r);
   private static final wy c = wy.c("gui.banned.title.permanent").a(n.r);
   public static final wy a = wy.c("gui.banned.name.title").a(n.r);
   private static final wy d = wy.c("gui.banned.skin.title").a(n.r);
   private static final wy e = wy.a("gui.banned.skin.description", wy.a(ayh.n));

   public static fwy a(BooleanConsumer $$0, BanDetails $$1) {
      return new fwy($$0, a($$1), b($$1), ayh.n, wx.m, true);
   }

   public static fwy a(Runnable $$0) {
      URI $$1 = ayh.n;
      return new fwy($$2 -> {
         if ($$2) {
            af.n().a($$1);
         }

         $$0.run();
      }, d, e, $$1, wx.m, true);
   }

   public static fwy a(String $$0, Runnable $$1) {
      URI $$2 = ayh.n;
      return new fwy($$2x -> {
         if ($$2x) {
            af.n().a($$2);
         }

         $$1.run();
      }, a, wy.a("gui.banned.name.description", wy.b($$0).a(n.o), wy.a(ayh.n)), $$2, wx.m, true);
   }

   private static wy a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static wy b(BanDetails $$0) {
      return wy.a("gui.banned.description", c($$0), d($$0), wy.a(ayh.n));
   }

   private static wy c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         gla $$4 = gla.a($$3);
         wy $$5;
         if ($$4 != null) {
            $$5 = xb.a($$4.a().f(), xv.a.a(true));
         } else if ($$2 != null) {
            $$5 = wy.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = wy.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return wy.a("gui.banned.description.reason", $$5);
      } else {
         return wy.c("gui.banned.description.unknownreason");
      }
   }

   private static wy d(BanDetails $$0) {
      if (f($$0)) {
         wy $$1 = e($$0);
         return wy.a("gui.banned.description.temporary", wy.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return wy.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static wy e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return wx.a($$1.toDays());
      } else {
         return $$2 < 1L ? wx.c($$1.toMinutes()) : wx.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}

public class ghk {
   public static final xi a = xi.c("quickplay.error.title");
   private static final xi b = xi.c("quickplay.error.invalid_identifier");
   private static final xi c = xi.c("quickplay.error.realm_connect");
   private static final xi d = xi.c("quickplay.error.realm_permission");
   private static final xi e = xi.c("gui.toTitle");
   private static final xi f = xi.c("gui.toWorld");
   private static final xi g = xi.c("gui.toRealms");

   public static void a(fji $$0, fwy.c $$1, fer $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bah.h($$3)) {
         a($$0, $$3);
      } else if (!bah.h($$4)) {
         b($$0, $$4);
      } else if (!bah.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fji $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fra $$2 = new fwf(new frc());
         $$0.a(new fqh($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new frc()));
      }
   }

   private static void b(fji $$0, String $$1) {
      gcx $$2 = new gcx($$0);
      $$2.a();
      gcw $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gcw(gzk.a("selectServer.defaultName"), $$1, gcw.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gdz $$4 = gdz.a($$1);
      fpz.a(new ftp(new frc()), $$0, $$4, $$3, true, null);
   }

   private static void a(fji $$0, fer $$1, String $$2) {
      long $$3;
      ffk $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fra $$6 = new fem(new frc());
         $$0.a(new fqh($$6, a, b, g));
         return;
      } catch (fgc var10) {
         fra $$8 = new frc();
         $$0.a(new fqh($$8, a, c, e));
         return;
      }

      ffi $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fra $$12 = new fem(new frc());
         $$0.a(new fqh($$12, a, d, g));
      } else {
         frc $$13 = new frc();
         fif $$14 = new fif($$13, $$11);
         $$0.a(new fgw($$13, $$14));
      }
   }
}

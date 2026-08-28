public class ggj {
   public static final xd a = xd.c("quickplay.error.title");
   private static final xd b = xd.c("quickplay.error.invalid_identifier");
   private static final xd c = xd.c("quickplay.error.realm_connect");
   private static final xd d = xd.c("quickplay.error.realm_permission");
   private static final xd e = xd.c("gui.toTitle");
   private static final xd f = xd.c("gui.toWorld");
   private static final xd g = xd.c("gui.toRealms");

   public static void a(fil $$0, fvy.c $$1, fdu $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!baa.h($$3)) {
         a($$0, $$3);
      } else if (!baa.h($$4)) {
         b($$0, $$4);
      } else if (!baa.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fil $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fqd $$2 = new fvg(new fqf());
         $$0.a(new fpk($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fqf()));
      }
   }

   private static void b(fil $$0, String $$1) {
      gbw $$2 = new gbw($$0);
      $$2.a();
      gbv $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gbv(gyi.a("selectServer.defaultName"), $$1, gbv.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gcy $$4 = gcy.a($$1);
      fpc.a(new fss(new fqf()), $$0, $$4, $$3, true, null);
   }

   private static void a(fil $$0, fdu $$1, String $$2) {
      long $$3;
      fen $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fqd $$6 = new fdp(new fqf());
         $$0.a(new fpk($$6, a, b, g));
         return;
      } catch (fff var10) {
         fqd $$8 = new fqf();
         $$0.a(new fpk($$8, a, c, e));
         return;
      }

      fel $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fqd $$12 = new fdp(new fqf());
         $$0.a(new fpk($$12, a, d, g));
      } else {
         fqf $$13 = new fqf();
         fhi $$14 = new fhi($$13, $$11);
         $$0.a(new ffz($$13, $$14));
      }
   }
}

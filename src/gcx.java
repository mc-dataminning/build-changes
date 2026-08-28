public class gcx {
   public static final xp a = xp.c("quickplay.error.title");
   private static final xp b = xp.c("quickplay.error.invalid_identifier");
   private static final xp c = xp.c("quickplay.error.realm_connect");
   private static final xp d = xp.c("quickplay.error.realm_permission");
   private static final xp e = xp.c("gui.toTitle");
   private static final xp f = xp.c("gui.toWorld");
   private static final xp g = xp.c("gui.toRealms");

   public static void a(fff $$0, fsq.c $$1, fao $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azv.h($$3)) {
         a($$0, $$3);
      } else if (!azv.h($$4)) {
         b($$0, $$4);
      } else if (!azv.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fff $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnd $$2 = new fry(new fni());
         $$0.a(new fme($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fni()));
      }
   }

   private static void b(fff $$0, String $$1) {
      fyk $$2 = new fyk($$0);
      $$2.a();
      fyj $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyj(gqf.a("selectServer.defaultName"), $$1, fyj.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fzm $$4 = fzm.a($$1);
      flw.a(new fqb(new fni()), $$0, $$4, $$3, true, null);
   }

   private static void a(fff $$0, fao $$1, String $$2) {
      long $$3;
      fbh $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnd $$6 = new faj(new fni());
         $$0.a(new fme($$6, a, b, g));
         return;
      } catch (fcb var10) {
         fnd $$8 = new fni();
         $$0.a(new fme($$8, a, c, e));
         return;
      }

      fbf $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnd $$12 = new faj(new fni());
         $$0.a(new fme($$12, a, d, g));
      } else {
         fni $$13 = new fni();
         fee $$14 = new fee($$13, $$11);
         $$0.a(new fcv($$13, $$14));
      }
   }
}

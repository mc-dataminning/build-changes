public class gcs {
   public static final xl a = xl.c("quickplay.error.title");
   private static final xl b = xl.c("quickplay.error.invalid_identifier");
   private static final xl c = xl.c("quickplay.error.realm_connect");
   private static final xl d = xl.c("quickplay.error.realm_permission");
   private static final xl e = xl.c("gui.toTitle");
   private static final xl f = xl.c("gui.toWorld");
   private static final xl g = xl.c("gui.toRealms");

   public static void a(ffa $$0, fsl.c $$1, faj $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azq.h($$3)) {
         a($$0, $$3);
      } else if (!azq.h($$4)) {
         b($$0, $$4);
      } else if (!azq.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(ffa $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fmy $$2 = new frt(new fnd());
         $$0.a(new flz($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnd()));
      }
   }

   private static void b(ffa $$0, String $$1) {
      fyf $$2 = new fyf($$0);
      $$2.a();
      fye $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fye(gqa.a("selectServer.defaultName"), $$1, fye.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fzh $$4 = fzh.a($$1);
      flr.a(new fpw(new fnd()), $$0, $$4, $$3, true, null);
   }

   private static void a(ffa $$0, faj $$1, String $$2) {
      long $$3;
      fbc $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fmy $$6 = new fae(new fnd());
         $$0.a(new flz($$6, a, b, g));
         return;
      } catch (fbw var10) {
         fmy $$8 = new fnd();
         $$0.a(new flz($$8, a, c, e));
         return;
      }

      fba $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fmy $$12 = new fae(new fnd());
         $$0.a(new flz($$12, a, d, g));
      } else {
         fnd $$13 = new fnd();
         fdz $$14 = new fdz($$13, $$11);
         $$0.a(new fcq($$13, $$14));
      }
   }
}

public class ggz {
   public static final xh a = xh.c("quickplay.error.title");
   private static final xh b = xh.c("quickplay.error.invalid_identifier");
   private static final xh c = xh.c("quickplay.error.realm_connect");
   private static final xh d = xh.c("quickplay.error.realm_permission");
   private static final xh e = xh.c("gui.toTitle");
   private static final xh f = xh.c("gui.toWorld");
   private static final xh g = xh.c("gui.toRealms");

   public static void a(fja $$0, fwn.c $$1, fej $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bag.h($$3)) {
         a($$0, $$3);
      } else if (!bag.h($$4)) {
         b($$0, $$4);
      } else if (!bag.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fja $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fqs $$2 = new fvv(new fqu());
         $$0.a(new fpz($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fqu()));
      }
   }

   private static void b(fja $$0, String $$1) {
      gcm $$2 = new gcm($$0);
      $$2.a();
      gcl $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gcl(gyz.a("selectServer.defaultName"), $$1, gcl.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gdo $$4 = gdo.a($$1);
      fpr.a(new fth(new fqu()), $$0, $$4, $$3, true, null);
   }

   private static void a(fja $$0, fej $$1, String $$2) {
      long $$3;
      ffc $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fqs $$6 = new fee(new fqu());
         $$0.a(new fpz($$6, a, b, g));
         return;
      } catch (ffu var10) {
         fqs $$8 = new fqu();
         $$0.a(new fpz($$8, a, c, e));
         return;
      }

      ffa $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fqs $$12 = new fee(new fqu());
         $$0.a(new fpz($$12, a, d, g));
      } else {
         fqu $$13 = new fqu();
         fhx $$14 = new fhx($$13, $$11);
         $$0.a(new fgo($$13, $$14));
      }
   }
}

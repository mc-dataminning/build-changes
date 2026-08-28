public class gkh {
   public static final xv a = xv.c("quickplay.error.title");
   private static final xv b = xv.c("quickplay.error.invalid_identifier");
   private static final xv c = xv.c("quickplay.error.realm_connect");
   private static final xv d = xv.c("quickplay.error.realm_permission");
   private static final xv e = xv.c("gui.toTitle");
   private static final xv f = xv.c("gui.toWorld");
   private static final xv g = xv.c("gui.toRealms");

   public static void a(flz $$0, fzr.c $$1, fhb $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bbb.h($$3)) {
         a($$0, $$3);
      } else if (!bbb.h($$4)) {
         b($$0, $$4);
      } else if (!bbb.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(flz $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         ftr $$2 = new fyy(new ftt());
         $$0.a(new fsy($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new ftt()));
      }
   }

   private static void b(flz $$0, String $$1) {
      gft $$2 = new gft($$0);
      $$2.a();
      gfs $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gfs(hcl.a("selectServer.defaultName"), $$1, gfs.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ggv $$4 = ggv.a($$1);
      fsq.a(new fwh(new ftt()), $$0, $$4, $$3, true, null);
   }

   private static void a(flz $$0, fhb $$1, String $$2) {
      long $$3;
      fie $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         ftr $$6 = new fgw(new ftt());
         $$0.a(new fsy($$6, a, b, g));
         return;
      } catch (fix var10) {
         ftr $$8 = new ftt();
         $$0.a(new fsy($$8, a, c, e));
         return;
      }

      fic $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         ftr $$12 = new fgw(new ftt());
         $$0.a(new fsy($$12, a, d, g));
      } else {
         ftt $$13 = new ftt();
         fkx $$14 = new fkx($$13, $$11);
         $$0.a(new fjr($$13, $$14));
      }
   }
}

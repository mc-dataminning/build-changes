public class gqt {
   public static final xg a = xg.c("quickplay.error.title");
   private static final xg b = xg.c("quickplay.error.invalid_identifier");
   private static final xg c = xg.c("quickplay.error.realm_connect");
   private static final xg d = xg.c("quickplay.error.realm_permission");
   private static final xg e = xg.c("gui.toTitle");
   private static final xg f = xg.c("gui.toWorld");
   private static final xg g = xg.c("gui.toRealms");

   public static void a(fqq $$0, gfs.c $$1, flq $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bay.h($$3)) {
         a($$0, $$3);
      } else if (!bay.h($$4)) {
         b($$0, $$4);
      } else if (!bay.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fqq $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fzq $$2 = new gez(new fzs());
         $$0.a(new fyx($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fzs()));
      }
   }

   private static void b(fqq $$0, String $$1) {
      gme $$2 = new gme($$0);
      $$2.a();
      gmd $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gmd(hly.a("selectServer.defaultName"), $$1, gmd.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gng $$4 = gng.a($$1);
      fyp.a(new gci(new fzs()), $$0, $$4, $$3, true, null);
   }

   private static void a(fqq $$0, flq $$1, String $$2) {
      long $$3;
      fmt $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.c();
      } catch (NumberFormatException var9) {
         fzq $$6 = new fll(new fzs());
         $$0.a(new fyx($$6, a, b, g));
         return;
      } catch (fnm var10) {
         fzq $$8 = new fzs();
         $$0.a(new fyx($$8, a, c, e));
         return;
      }

      fmr $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fzq $$12 = new fll(new fzs());
         $$0.a(new fyx($$12, a, d, g));
      } else {
         fzs $$13 = new fzs();
         fpn $$14 = new fpn($$13, $$11);
         $$0.a(new fog($$13, $$14));
      }
   }
}

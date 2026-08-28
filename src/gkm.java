public class gkm {
   public static final xv a = xv.c("quickplay.error.title");
   private static final xv b = xv.c("quickplay.error.invalid_identifier");
   private static final xv c = xv.c("quickplay.error.realm_connect");
   private static final xv d = xv.c("quickplay.error.realm_permission");
   private static final xv e = xv.c("gui.toTitle");
   private static final xv f = xv.c("gui.toWorld");
   private static final xv g = xv.c("gui.toRealms");

   public static void a(fme $$0, fzw.c $$1, fhg $$2) {
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

   private static void a(fme $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         ftw $$2 = new fzd(new fty());
         $$0.a(new ftd($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fty()));
      }
   }

   private static void b(fme $$0, String $$1) {
      gfy $$2 = new gfy($$0);
      $$2.a();
      gfx $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gfx(hcq.a("selectServer.defaultName"), $$1, gfx.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gha $$4 = gha.a($$1);
      fsv.a(new fwm(new fty()), $$0, $$4, $$3, true, null);
   }

   private static void a(fme $$0, fhg $$1, String $$2) {
      long $$3;
      fij $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         ftw $$6 = new fhb(new fty());
         $$0.a(new ftd($$6, a, b, g));
         return;
      } catch (fjc var10) {
         ftw $$8 = new fty();
         $$0.a(new ftd($$8, a, c, e));
         return;
      }

      fih $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         ftw $$12 = new fhb(new fty());
         $$0.a(new ftd($$12, a, d, g));
      } else {
         fty $$13 = new fty();
         flc $$14 = new flc($$13, $$11);
         $$0.a(new fjw($$13, $$14));
      }
   }
}

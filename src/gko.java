public class gko {
   public static final xv a = xv.c("quickplay.error.title");
   private static final xv b = xv.c("quickplay.error.invalid_identifier");
   private static final xv c = xv.c("quickplay.error.realm_connect");
   private static final xv d = xv.c("quickplay.error.realm_permission");
   private static final xv e = xv.c("gui.toTitle");
   private static final xv f = xv.c("gui.toWorld");
   private static final xv g = xv.c("gui.toRealms");

   public static void a(fmg $$0, fzy.c $$1, fhi $$2) {
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

   private static void a(fmg $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fty $$2 = new fzf(new fua());
         $$0.a(new ftf($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fua()));
      }
   }

   private static void b(fmg $$0, String $$1) {
      gga $$2 = new gga($$0);
      $$2.a();
      gfz $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gfz(hcs.a("selectServer.defaultName"), $$1, gfz.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ghc $$4 = ghc.a($$1);
      fsx.a(new fwo(new fua()), $$0, $$4, $$3, true, null);
   }

   private static void a(fmg $$0, fhi $$1, String $$2) {
      long $$3;
      fil $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fty $$6 = new fhd(new fua());
         $$0.a(new ftf($$6, a, b, g));
         return;
      } catch (fje var10) {
         fty $$8 = new fua();
         $$0.a(new ftf($$8, a, c, e));
         return;
      }

      fij $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fty $$12 = new fhd(new fua());
         $$0.a(new ftf($$12, a, d, g));
      } else {
         fua $$13 = new fua();
         fle $$14 = new fle($$13, $$11);
         $$0.a(new fjy($$13, $$14));
      }
   }
}

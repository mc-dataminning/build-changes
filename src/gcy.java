public class gcy {
   public static final xp a = xp.c("quickplay.error.title");
   private static final xp b = xp.c("quickplay.error.invalid_identifier");
   private static final xp c = xp.c("quickplay.error.realm_connect");
   private static final xp d = xp.c("quickplay.error.realm_permission");
   private static final xp e = xp.c("gui.toTitle");
   private static final xp f = xp.c("gui.toWorld");
   private static final xp g = xp.c("gui.toRealms");

   public static void a(ffg $$0, fsr.c $$1, fap $$2) {
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

   private static void a(ffg $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fne $$2 = new frz(new fnj());
         $$0.a(new fmf($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnj()));
      }
   }

   private static void b(ffg $$0, String $$1) {
      fyl $$2 = new fyl($$0);
      $$2.a();
      fyk $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyk(gqg.a("selectServer.defaultName"), $$1, fyk.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fzn $$4 = fzn.a($$1);
      flx.a(new fqc(new fnj()), $$0, $$4, $$3, true, null);
   }

   private static void a(ffg $$0, fap $$1, String $$2) {
      long $$3;
      fbi $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fne $$6 = new fak(new fnj());
         $$0.a(new fmf($$6, a, b, g));
         return;
      } catch (fcc var10) {
         fne $$8 = new fnj();
         $$0.a(new fmf($$8, a, c, e));
         return;
      }

      fbg $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fne $$12 = new fak(new fnj());
         $$0.a(new fmf($$12, a, d, g));
      } else {
         fnj $$13 = new fnj();
         fef $$14 = new fef($$13, $$11);
         $$0.a(new fcw($$13, $$14));
      }
   }
}

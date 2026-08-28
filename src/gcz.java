public class gcz {
   public static final xp a = xp.c("quickplay.error.title");
   private static final xp b = xp.c("quickplay.error.invalid_identifier");
   private static final xp c = xp.c("quickplay.error.realm_connect");
   private static final xp d = xp.c("quickplay.error.realm_permission");
   private static final xp e = xp.c("gui.toTitle");
   private static final xp f = xp.c("gui.toWorld");
   private static final xp g = xp.c("gui.toRealms");

   public static void a(ffh $$0, fss.c $$1, faq $$2) {
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

   private static void a(ffh $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnf $$2 = new fsa(new fnk());
         $$0.a(new fmg($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnk()));
      }
   }

   private static void b(ffh $$0, String $$1) {
      fym $$2 = new fym($$0);
      $$2.a();
      fyl $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyl(gqh.a("selectServer.defaultName"), $$1, fyl.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fzo $$4 = fzo.a($$1);
      fly.a(new fqd(new fnk()), $$0, $$4, $$3, true, null);
   }

   private static void a(ffh $$0, faq $$1, String $$2) {
      long $$3;
      fbj $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnf $$6 = new fal(new fnk());
         $$0.a(new fmg($$6, a, b, g));
         return;
      } catch (fcd var10) {
         fnf $$8 = new fnk();
         $$0.a(new fmg($$8, a, c, e));
         return;
      }

      fbh $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnf $$12 = new fal(new fnk());
         $$0.a(new fmg($$12, a, d, g));
      } else {
         fnk $$13 = new fnk();
         feg $$14 = new feg($$13, $$11);
         $$0.a(new fcx($$13, $$14));
      }
   }
}

public class gcw {
   public static final xo a = xo.c("quickplay.error.title");
   private static final xo b = xo.c("quickplay.error.invalid_identifier");
   private static final xo c = xo.c("quickplay.error.realm_connect");
   private static final xo d = xo.c("quickplay.error.realm_permission");
   private static final xo e = xo.c("gui.toTitle");
   private static final xo f = xo.c("gui.toWorld");
   private static final xo g = xo.c("gui.toRealms");

   public static void a(ffe $$0, fsp.c $$1, fan $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azu.h($$3)) {
         a($$0, $$3);
      } else if (!azu.h($$4)) {
         b($$0, $$4);
      } else if (!azu.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(ffe $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnc $$2 = new frx(new fnh());
         $$0.a(new fmd($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnh()));
      }
   }

   private static void b(ffe $$0, String $$1) {
      fyj $$2 = new fyj($$0);
      $$2.a();
      fyi $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyi(gqe.a("selectServer.defaultName"), $$1, fyi.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fzl $$4 = fzl.a($$1);
      flv.a(new fqa(new fnh()), $$0, $$4, $$3, true, null);
   }

   private static void a(ffe $$0, fan $$1, String $$2) {
      long $$3;
      fbg $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnc $$6 = new fai(new fnh());
         $$0.a(new fmd($$6, a, b, g));
         return;
      } catch (fca var10) {
         fnc $$8 = new fnh();
         $$0.a(new fmd($$8, a, c, e));
         return;
      }

      fbe $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnc $$12 = new fai(new fnh());
         $$0.a(new fmd($$12, a, d, g));
      } else {
         fnh $$13 = new fnh();
         fed $$14 = new fed($$13, $$11);
         $$0.a(new fcu($$13, $$14));
      }
   }
}

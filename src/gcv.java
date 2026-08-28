public class gcv {
   public static final xo a = xo.c("quickplay.error.title");
   private static final xo b = xo.c("quickplay.error.invalid_identifier");
   private static final xo c = xo.c("quickplay.error.realm_connect");
   private static final xo d = xo.c("quickplay.error.realm_permission");
   private static final xo e = xo.c("gui.toTitle");
   private static final xo f = xo.c("gui.toWorld");
   private static final xo g = xo.c("gui.toRealms");

   public static void a(ffd $$0, fso.c $$1, fam $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azt.h($$3)) {
         a($$0, $$3);
      } else if (!azt.h($$4)) {
         b($$0, $$4);
      } else if (!azt.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(ffd $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnb $$2 = new frw(new fng());
         $$0.a(new fmc($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fng()));
      }
   }

   private static void b(ffd $$0, String $$1) {
      fyi $$2 = new fyi($$0);
      $$2.a();
      fyh $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyh(gqd.a("selectServer.defaultName"), $$1, fyh.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fzk $$4 = fzk.a($$1);
      flu.a(new fpz(new fng()), $$0, $$4, $$3, true, null);
   }

   private static void a(ffd $$0, fam $$1, String $$2) {
      long $$3;
      fbf $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnb $$6 = new fah(new fng());
         $$0.a(new fmc($$6, a, b, g));
         return;
      } catch (fbz var10) {
         fnb $$8 = new fng();
         $$0.a(new fmc($$8, a, c, e));
         return;
      }

      fbd $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnb $$12 = new fah(new fng());
         $$0.a(new fmc($$12, a, d, g));
      } else {
         fng $$13 = new fng();
         fec $$14 = new fec($$13, $$11);
         $$0.a(new fct($$13, $$14));
      }
   }
}

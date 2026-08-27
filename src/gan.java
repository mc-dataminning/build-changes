public class gan {
   public static final ws a = ws.c("quickplay.error.title");
   private static final ws b = ws.c("quickplay.error.invalid_identifier");
   private static final ws c = ws.c("quickplay.error.realm_connect");
   private static final ws d = ws.c("quickplay.error.realm_permission");
   private static final ws e = ws.c("gui.toTitle");
   private static final ws f = ws.c("gui.toWorld");
   private static final ws g = ws.c("gui.toRealms");

   public static void a(fcu $$0, fqh.c $$1, eyd $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ayr.h($$3)) {
         a($$0, $$3);
      } else if (!ayr.h($$4)) {
         b($$0, $$4);
      } else if (!ayr.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fcu $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fkt $$2 = new fpp(new fky());
         $$0.a(new fju($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fky()));
      }
   }

   private static void b(fcu $$0, String $$1) {
      fwb $$2 = new fwb($$0);
      $$2.a();
      fwa $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fwa(gnt.a("selectServer.defaultName"), $$1, fwa.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fxd $$4 = fxd.a($$1);
      fjm.a(new fnq(new fky()), $$0, $$4, $$3, true, null);
   }

   private static void a(fcu $$0, eyd $$1, String $$2) {
      long $$3;
      eyw $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fkt $$6 = new exy(new fky());
         $$0.a(new fju($$6, a, b, g));
         return;
      } catch (ezq var10) {
         fkt $$8 = new fky();
         $$0.a(new fju($$8, a, c, e));
         return;
      }

      eyu $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fkt $$12 = new exy(new fky());
         $$0.a(new fju($$12, a, d, g));
      } else {
         fky $$13 = new fky();
         fbt $$14 = new fbt($$13, $$11);
         $$0.a(new fak($$13, $$14));
      }
   }
}

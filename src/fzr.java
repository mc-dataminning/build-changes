public class fzr {
   public static final wi a = wi.c("quickplay.error.title");
   private static final wi b = wi.c("quickplay.error.invalid_identifier");
   private static final wi c = wi.c("quickplay.error.realm_connect");
   private static final wi d = wi.c("quickplay.error.realm_permission");
   private static final wi e = wi.c("gui.toTitle");
   private static final wi f = wi.c("gui.toWorld");
   private static final wi g = wi.c("gui.toRealms");

   public static void a(fby $$0, fpl.c $$1, exh $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ayh.h($$3)) {
         a($$0, $$3);
      } else if (!ayh.h($$4)) {
         b($$0, $$4);
      } else if (!ayh.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fby $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fjx $$2 = new fot(new fkc());
         $$0.a(new fiy($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fkc()));
      }
   }

   private static void b(fby $$0, String $$1) {
      fvf $$2 = new fvf($$0);
      $$2.a();
      fve $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fve(gmx.a("selectServer.defaultName"), $$1, fve.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fwh $$4 = fwh.a($$1);
      fiq.a(new fmu(new fkc()), $$0, $$4, $$3, true, null);
   }

   private static void a(fby $$0, exh $$1, String $$2) {
      long $$3;
      eya $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fjx $$6 = new exc(new fkc());
         $$0.a(new fiy($$6, a, b, g));
         return;
      } catch (eyu var10) {
         fjx $$8 = new fkc();
         $$0.a(new fiy($$8, a, c, e));
         return;
      }

      exy $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fjx $$12 = new exc(new fkc());
         $$0.a(new fiy($$12, a, d, g));
      } else {
         fkc $$13 = new fkc();
         fax $$14 = new fax($$13, $$11);
         $$0.a(new ezo($$13, $$14));
      }
   }
}

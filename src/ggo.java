public class ggo {
   public static final xe a = xe.c("quickplay.error.title");
   private static final xe b = xe.c("quickplay.error.invalid_identifier");
   private static final xe c = xe.c("quickplay.error.realm_connect");
   private static final xe d = xe.c("quickplay.error.realm_permission");
   private static final xe e = xe.c("gui.toTitle");
   private static final xe f = xe.c("gui.toWorld");
   private static final xe g = xe.c("gui.toRealms");

   public static void a(fip $$0, fwc.c $$1, fdy $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bac.h($$3)) {
         a($$0, $$3);
      } else if (!bac.h($$4)) {
         b($$0, $$4);
      } else if (!bac.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fip $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fqh $$2 = new fvk(new fqj());
         $$0.a(new fpo($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fqj()));
      }
   }

   private static void b(fip $$0, String $$1) {
      gcb $$2 = new gcb($$0);
      $$2.a();
      gca $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gca(gyn.a("selectServer.defaultName"), $$1, gca.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gdd $$4 = gdd.a($$1);
      fpg.a(new fsw(new fqj()), $$0, $$4, $$3, true, null);
   }

   private static void a(fip $$0, fdy $$1, String $$2) {
      long $$3;
      fer $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fqh $$6 = new fdt(new fqj());
         $$0.a(new fpo($$6, a, b, g));
         return;
      } catch (ffj var10) {
         fqh $$8 = new fqj();
         $$0.a(new fpo($$8, a, c, e));
         return;
      }

      fep $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fqh $$12 = new fdt(new fqj());
         $$0.a(new fpo($$12, a, d, g));
      } else {
         fqj $$13 = new fqj();
         fhm $$14 = new fhm($$13, $$11);
         $$0.a(new fgd($$13, $$14));
      }
   }
}

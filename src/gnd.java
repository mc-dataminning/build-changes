public class gnd {
   public static final wv a = wv.c("quickplay.error.title");
   private static final wv b = wv.c("quickplay.error.invalid_identifier");
   private static final wv c = wv.c("quickplay.error.realm_connect");
   private static final wv d = wv.c("quickplay.error.realm_permission");
   private static final wv e = wv.c("gui.toTitle");
   private static final wv f = wv.c("gui.toWorld");
   private static final wv g = wv.c("gui.toRealms");

   public static void a(fnd $$0, gch.c $$1, fie $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bah.h($$3)) {
         a($$0, $$3);
      } else if (!bah.h($$4)) {
         b($$0, $$4);
      } else if (!bah.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fnd $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fwf $$2 = new gbo(new fwh());
         $$0.a(new fvm($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fwh()));
      }
   }

   private static void b(fnd $$0, String $$1) {
      gip $$2 = new gip($$0);
      $$2.a();
      gio $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gio(hia.a("selectServer.defaultName"), $$1, gio.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gjr $$4 = gjr.a($$1);
      fve.a(new fyx(new fwh()), $$0, $$4, $$3, true, null);
   }

   private static void a(fnd $$0, fie $$1, String $$2) {
      long $$3;
      fjh $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fwf $$6 = new fhz(new fwh());
         $$0.a(new fvm($$6, a, b, g));
         return;
      } catch (fka var10) {
         fwf $$8 = new fwh();
         $$0.a(new fvm($$8, a, c, e));
         return;
      }

      fjf $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fwf $$12 = new fhz(new fwh());
         $$0.a(new fvm($$12, a, d, g));
      } else {
         fwh $$13 = new fwh();
         fma $$14 = new fma($$13, $$11);
         $$0.a(new fku($$13, $$14));
      }
   }
}

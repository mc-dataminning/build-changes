public class gia {
   public static final xl a = xl.c("quickplay.error.title");
   private static final xl b = xl.c("quickplay.error.invalid_identifier");
   private static final xl c = xl.c("quickplay.error.realm_connect");
   private static final xl d = xl.c("quickplay.error.realm_permission");
   private static final xl e = xl.c("gui.toTitle");
   private static final xl f = xl.c("gui.toWorld");
   private static final xl g = xl.c("gui.toRealms");

   public static void a(fjx $$0, fxo.c $$1, ffa $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bak.h($$3)) {
         a($$0, $$3);
      } else if (!bak.h($$4)) {
         b($$0, $$4);
      } else if (!bak.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fjx $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         frp $$2 = new fwv(new frr());
         $$0.a(new fqw($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new frr()));
      }
   }

   private static void b(fjx $$0, String $$1) {
      gdn $$2 = new gdn($$0);
      $$2.a();
      gdm $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gdm(haa.a("selectServer.defaultName"), $$1, gdm.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gep $$4 = gep.a($$1);
      fqo.a(new fue(new frr()), $$0, $$4, $$3, true, null);
   }

   private static void a(fjx $$0, ffa $$1, String $$2) {
      long $$3;
      fgd $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         frp $$6 = new fev(new frr());
         $$0.a(new fqw($$6, a, b, g));
         return;
      } catch (fgv var10) {
         frp $$8 = new frr();
         $$0.a(new fqw($$8, a, c, e));
         return;
      }

      fgb $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         frp $$12 = new fev(new frr());
         $$0.a(new fqw($$12, a, d, g));
      } else {
         frr $$13 = new frr();
         fiv $$14 = new fiv($$13, $$11);
         $$0.a(new fhp($$13, $$14));
      }
   }
}

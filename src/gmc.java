public class gmc {
   public static final wp a = wp.c("quickplay.error.title");
   private static final wp b = wp.c("quickplay.error.invalid_identifier");
   private static final wp c = wp.c("quickplay.error.realm_connect");
   private static final wp d = wp.c("quickplay.error.realm_permission");
   private static final wp e = wp.c("gui.toTitle");
   private static final wp f = wp.c("gui.toWorld");
   private static final wp g = wp.c("gui.toRealms");

   public static void a(fmg $$0, gbi.c $$1, fhh $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azw.h($$3)) {
         a($$0, $$3);
      } else if (!azw.h($$4)) {
         b($$0, $$4);
      } else if (!azw.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fmg $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fvi $$2 = new gap(new fvk());
         $$0.a(new fup($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fvk()));
      }
   }

   private static void b(fmg $$0, String $$1) {
      gho $$2 = new gho($$0);
      $$2.a();
      ghn $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new ghn(hgz.a("selectServer.defaultName"), $$1, ghn.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      giq $$4 = giq.a($$1);
      fuh.a(new fxy(new fvk()), $$0, $$4, $$3, true, null);
   }

   private static void a(fmg $$0, fhh $$1, String $$2) {
      long $$3;
      fik $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fvi $$6 = new fhc(new fvk());
         $$0.a(new fup($$6, a, b, g));
         return;
      } catch (fjd var10) {
         fvi $$8 = new fvk();
         $$0.a(new fup($$8, a, c, e));
         return;
      }

      fii $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fvi $$12 = new fhc(new fvk());
         $$0.a(new fup($$12, a, d, g));
      } else {
         fvk $$13 = new fvk();
         fld $$14 = new fld($$13, $$11);
         $$0.a(new fjx($$13, $$14));
      }
   }
}

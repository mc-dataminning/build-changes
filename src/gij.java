public class gij {
   public static final xj a = xj.c("quickplay.error.title");
   private static final xj b = xj.c("quickplay.error.invalid_identifier");
   private static final xj c = xj.c("quickplay.error.realm_connect");
   private static final xj d = xj.c("quickplay.error.realm_permission");
   private static final xj e = xj.c("gui.toTitle");
   private static final xj f = xj.c("gui.toWorld");
   private static final xj g = xj.c("gui.toRealms");

   public static void a(fke $$0, fxw.c $$1, ffh $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!baj.h($$3)) {
         a($$0, $$3);
      } else if (!baj.h($$4)) {
         b($$0, $$4);
      } else if (!baj.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fke $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         frw $$2 = new fxd(new fry());
         $$0.a(new frd($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fry()));
      }
   }

   private static void b(fke $$0, String $$1) {
      gdw $$2 = new gdw($$0);
      $$2.a();
      gdv $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gdv(hal.a("selectServer.defaultName"), $$1, gdv.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gey $$4 = gey.a($$1);
      fqv.a(new fum(new fry()), $$0, $$4, $$3, true, null);
   }

   private static void a(fke $$0, ffh $$1, String $$2) {
      long $$3;
      fgk $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         frw $$6 = new ffc(new fry());
         $$0.a(new frd($$6, a, b, g));
         return;
      } catch (fhc var10) {
         frw $$8 = new fry();
         $$0.a(new frd($$8, a, c, e));
         return;
      }

      fgi $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         frw $$12 = new ffc(new fry());
         $$0.a(new frd($$12, a, d, g));
      } else {
         fry $$13 = new fry();
         fjc $$14 = new fjc($$13, $$11);
         $$0.a(new fhw($$13, $$14));
      }
   }
}

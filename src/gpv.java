public class gpv {
   public static final wy a = wy.c("quickplay.error.title");
   private static final wy b = wy.c("quickplay.error.invalid_identifier");
   private static final wy c = wy.c("quickplay.error.realm_connect");
   private static final wy d = wy.c("quickplay.error.realm_permission");
   private static final wy e = wy.c("gui.toTitle");
   private static final wy f = wy.c("gui.toWorld");
   private static final wy g = wy.c("gui.toRealms");

   public static void a(fpt $$0, geu.c $$1, fkt $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bal.h($$3)) {
         a($$0, $$3);
      } else if (!bal.h($$4)) {
         b($$0, $$4);
      } else if (!bal.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fpt $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fys $$2 = new geb(new fyu());
         $$0.a(new fxz($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fyu()));
      }
   }

   private static void b(fpt $$0, String $$1) {
      glg $$2 = new glg($$0);
      $$2.a();
      glf $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new glf(hky.a("selectServer.defaultName"), $$1, glf.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gmi $$4 = gmi.a($$1);
      fxr.a(new gbk(new fyu()), $$0, $$4, $$3, true, null);
   }

   private static void a(fpt $$0, fkt $$1, String $$2) {
      long $$3;
      flw $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fys $$6 = new fko(new fyu());
         $$0.a(new fxz($$6, a, b, g));
         return;
      } catch (fmp var10) {
         fys $$8 = new fyu();
         $$0.a(new fxz($$8, a, c, e));
         return;
      }

      flu $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fys $$12 = new fko(new fyu());
         $$0.a(new fxz($$12, a, d, g));
      } else {
         fyu $$13 = new fyu();
         fop $$14 = new fop($$13, $$11);
         $$0.a(new fnj($$13, $$14));
      }
   }
}

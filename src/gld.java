public class gld {
   public static final wp a = wp.c("quickplay.error.title");
   private static final wp b = wp.c("quickplay.error.invalid_identifier");
   private static final wp c = wp.c("quickplay.error.realm_connect");
   private static final wp d = wp.c("quickplay.error.realm_permission");
   private static final wp e = wp.c("gui.toTitle");
   private static final wp f = wp.c("gui.toWorld");
   private static final wp g = wp.c("gui.toRealms");

   public static void a(flj $$0, gal.c $$1, fgk $$2) {
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

   private static void a(flj $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         ful $$2 = new fzs(new fun());
         $$0.a(new fts($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fun()));
      }
   }

   private static void b(flj $$0, String $$1) {
      ggp $$2 = new ggp($$0);
      $$2.a();
      ggo $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new ggo(hga.a("selectServer.defaultName"), $$1, ggo.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ghr $$4 = ghr.a($$1);
      ftk.a(new fxb(new fun()), $$0, $$4, $$3, true, null);
   }

   private static void a(flj $$0, fgk $$1, String $$2) {
      long $$3;
      fhn $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         ful $$6 = new fgf(new fun());
         $$0.a(new fts($$6, a, b, g));
         return;
      } catch (fig var10) {
         ful $$8 = new fun();
         $$0.a(new fts($$8, a, c, e));
         return;
      }

      fhl $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         ful $$12 = new fgf(new fun());
         $$0.a(new fts($$12, a, d, g));
      } else {
         fun $$13 = new fun();
         fkg $$14 = new fkg($$13, $$11);
         $$0.a(new fja($$13, $$14));
      }
   }
}

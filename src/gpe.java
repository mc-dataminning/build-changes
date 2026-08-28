public class gpe {
   public static final wy a = wy.c("quickplay.error.title");
   private static final wy b = wy.c("quickplay.error.invalid_identifier");
   private static final wy c = wy.c("quickplay.error.realm_connect");
   private static final wy d = wy.c("quickplay.error.realm_permission");
   private static final wy e = wy.c("gui.toTitle");
   private static final wy f = wy.c("gui.toWorld");
   private static final wy g = wy.c("gui.toRealms");

   public static void a(foz $$0, ged.c $$1, fjz $$2) {
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

   private static void a(foz $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fyb $$2 = new gdk(new fyd());
         $$0.a(new fxi($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fyd()));
      }
   }

   private static void b(foz $$0, String $$1) {
      gkp $$2 = new gkp($$0);
      $$2.a();
      gko $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gko(hke.a("selectServer.defaultName"), $$1, gko.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      glr $$4 = glr.a($$1);
      fxa.a(new gat(new fyd()), $$0, $$4, $$3, true, null);
   }

   private static void a(foz $$0, fjz $$1, String $$2) {
      long $$3;
      flc $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fyb $$6 = new fju(new fyd());
         $$0.a(new fxi($$6, a, b, g));
         return;
      } catch (flv var10) {
         fyb $$8 = new fyd();
         $$0.a(new fxi($$8, a, c, e));
         return;
      }

      fla $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fyb $$12 = new fju(new fyd());
         $$0.a(new fxi($$12, a, d, g));
      } else {
         fyd $$13 = new fyd();
         fnv $$14 = new fnv($$13, $$11);
         $$0.a(new fmp($$13, $$14));
      }
   }
}

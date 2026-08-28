public class gpq {
   public static final wy a = wy.c("quickplay.error.title");
   private static final wy b = wy.c("quickplay.error.invalid_identifier");
   private static final wy c = wy.c("quickplay.error.realm_connect");
   private static final wy d = wy.c("quickplay.error.realm_permission");
   private static final wy e = wy.c("gui.toTitle");
   private static final wy f = wy.c("gui.toWorld");
   private static final wy g = wy.c("gui.toRealms");

   public static void a(fpo $$0, gep.c $$1, fko $$2) {
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

   private static void a(fpo $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fyn $$2 = new gdw(new fyp());
         $$0.a(new fxu($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fyp()));
      }
   }

   private static void b(fpo $$0, String $$1) {
      glb $$2 = new glb($$0);
      $$2.a();
      gla $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gla(hkr.a("selectServer.defaultName"), $$1, gla.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gmd $$4 = gmd.a($$1);
      fxm.a(new gbf(new fyp()), $$0, $$4, $$3, true, null);
   }

   private static void a(fpo $$0, fko $$1, String $$2) {
      long $$3;
      flr $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fyn $$6 = new fkj(new fyp());
         $$0.a(new fxu($$6, a, b, g));
         return;
      } catch (fmk var10) {
         fyn $$8 = new fyp();
         $$0.a(new fxu($$8, a, c, e));
         return;
      }

      flp $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fyn $$12 = new fkj(new fyp());
         $$0.a(new fxu($$12, a, d, g));
      } else {
         fyp $$13 = new fyp();
         fok $$14 = new fok($$13, $$11);
         $$0.a(new fne($$13, $$14));
      }
   }
}

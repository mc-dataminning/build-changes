public class gdo {
   public static final wu a = wu.c("quickplay.error.title");
   private static final wu b = wu.c("quickplay.error.invalid_identifier");
   private static final wu c = wu.c("quickplay.error.realm_connect");
   private static final wu d = wu.c("quickplay.error.realm_permission");
   private static final wu e = wu.c("gui.toTitle");
   private static final wu f = wu.c("gui.toWorld");
   private static final wu g = wu.c("gui.toRealms");

   public static void a(ffw $$0, ftg.c $$1, fbe $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azd.h($$3)) {
         a($$0, $$3);
      } else if (!azd.h($$4)) {
         b($$0, $$4);
      } else if (!azd.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(ffw $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnl $$2 = new fso(new fnn());
         $$0.a(new fms($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnn()));
      }
   }

   private static void b(ffw $$0, String $$1) {
      fza $$2 = new fza($$0);
      $$2.a();
      fyz $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyz(gqw.a("selectServer.defaultName"), $$1, fyz.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gad $$4 = gad.a($$1);
      fmk.a(new fqa(new fnn()), $$0, $$4, $$3, true, null);
   }

   private static void a(ffw $$0, fbe $$1, String $$2) {
      long $$3;
      fbx $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnl $$6 = new faz(new fnn());
         $$0.a(new fms($$6, a, b, g));
         return;
      } catch (fcr var10) {
         fnl $$8 = new fnn();
         $$0.a(new fms($$8, a, c, e));
         return;
      }

      fbv $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnl $$12 = new faz(new fnn());
         $$0.a(new fms($$12, a, d, g));
      } else {
         fnn $$13 = new fnn();
         feu $$14 = new feu($$13, $$11);
         $$0.a(new fdl($$13, $$14));
      }
   }
}
